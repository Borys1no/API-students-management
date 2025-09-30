package com.example.student_management.controllers;

import com.example.student_management.domain.Rol;
import com.example.student_management.repository.RolRepository;

import java.util.List;

public class RolController {
    private RolRepository rolRepository;

    public List<Rol> getAllRol(){
        return rolRepository.findAll();
    }
}
