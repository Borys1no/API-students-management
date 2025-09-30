package com.example.student_management.repository;

import com.example.student_management.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
}
