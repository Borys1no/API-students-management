package com.example.student_management.domain;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity
@Table(name = "alumno")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos de un alumno
    private int id_alumno;
    private String nombres;
    private String apellidos;
    private int ci;
    private Date fecha_nacimiento;
    private String email;
    private String matricula;

    public Student(){}

    //Constructor


    public Student(int id_alumno, String nombres, String apellidos, int ci, Date fecha_nacimiento, String email, String matricula) {
        this.id_alumno = id_alumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ci = ci;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.matricula = matricula;
    }

    //Getter & Setter


    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
