package com.example.student_management.controllers;

import com.example.student_management.domain.Profesor;
import com.example.student_management.dto.RegistroProfesorDTO;
import com.example.student_management.repository.ProfesorRepository;
import com.example.student_management.service.RegistroProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/profesor")
public class ProfesorController {

    private final RegistroProfesorService registroProfesorService;

    public ProfesorController(RegistroProfesorService registroProfesorService){
        this.registroProfesorService = registroProfesorService;
    }
    @Autowired
    private ProfesorRepository profesorRepository;

    @GetMapping
    public List<Profesor> getAllProfesores(){
        return profesorRepository.findAll();
    }

    @PostMapping
    public Profesor createProfesor(@RequestBody RegistroProfesorDTO dto){
        return registroProfesorService.registrarProfesor(dto);
    }

    @GetMapping("/{id}")
    public Profesor getProfesorById(@PathVariable int id){
        return profesorRepository.findById(id).orElse(null);
    }

    @GetMapping("/especialidad/{especialidad}")
    public List<Profesor> getProfesorByEspecialidad(@PathVariable String especialidad){
        return profesorRepository.findByEspecialidad(especialidad);
    }
}
