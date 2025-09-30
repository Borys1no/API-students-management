package com.example.student_management.service;

import com.example.student_management.domain.Profesor;
import com.example.student_management.domain.Usuario;
import com.example.student_management.domain.UsuarioRol;
import com.example.student_management.dto.RegistroProfesorDTO;
import com.example.student_management.repository.ProfesorRepository;
import com.example.student_management.repository.UsuarioRepository;
import com.example.student_management.repository.UsuarioRolRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RegistroProfesorService {


    private final UsuarioRepository usuarioRepository;
    private final UsuarioRolRepository usuarioRolRepository;
    private final ProfesorRepository profesorRepository;

    public RegistroProfesorService(UsuarioRepository usuarioRepository, UsuarioRolRepository usuarioRolRepository, ProfesorRepository profesorRepository) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioRolRepository = usuarioRolRepository;
        this.profesorRepository = profesorRepository;
    }

    @Transactional
    public Profesor registrarProfesor(RegistroProfesorDTO dto){
        Usuario usuario = new Usuario();
        usuario.setUsername(dto.getUsername());
        usuario.setPassword(dto.getPassword());
        usuario.setEmail(dto.getEmail());
        Usuario savedUsuario = usuarioRepository.save(usuario);

        for(Integer rolId: dto.getRoles()){
            UsuarioRol ur = new UsuarioRol(savedUsuario.getId_usuario(), rolId);
            usuarioRolRepository.save(ur);

        }
        Profesor profesor = new Profesor();
        profesor.setNombres(dto.getNombres());
        profesor.setApellidos(dto.getApellidos());
        profesor.setEmail(dto.getEmail());
        profesor.setEspecialidad(dto.getEspecialidad());
        profesor.setId_profesor(savedUsuario.getId_usuario());

        return profesorRepository.save(profesor);
    }

}
