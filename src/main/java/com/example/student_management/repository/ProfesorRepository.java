package com.example.student_management.repository;

import com.example.student_management.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
    List<Profesor> findByEspecialidad(String especialidad);

}