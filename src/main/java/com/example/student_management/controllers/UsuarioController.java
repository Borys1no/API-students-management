package com.example.student_management.controllers;


import com.example.student_management.domain.Usuario;
import com.example.student_management.domain.UsuarioRol;
import com.example.student_management.dto.UsuarioDto;
import com.example.student_management.repository.UsuarioRepository;
import com.example.student_management.repository.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    @GetMapping
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    @PostMapping("/crearConRol")
    public Usuario createUsuarioConRol(@RequestBody UsuarioDto dto){
        Usuario usuario = new Usuario();
        usuario.setUsername(dto.getUsername());
        usuario.setPassword(dto.getPassword());
        usuario.setEmail(dto.getEmail());
        usuario.setEnabled(true);
        Usuario savedUsuario = usuarioRepository.save(usuario);

        for(Integer rolId : dto.getRoles()){
            UsuarioRol ur = new UsuarioRol(savedUsuario.getId_usuario(), rolId );
            usuarioRolRepository.save(ur);
        }
        return savedUsuario;
    }
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable int id){
        return usuarioRepository.findById(id).orElse(null);
    }






}
