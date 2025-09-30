package com.example.student_management.repository;

import com.example.student_management.domain.UsuarioRol;
import com.example.student_management.domain.UsuarioRolId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, UsuarioRolId> {
}
