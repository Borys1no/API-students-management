package com.example.student_management.domain;

public class Profesor {
    private  int id_profesor;
    private String nombres;
    private String apellidos;
    private String email;
    private String especialidad;


    //Constructor


    public Profesor(int id_profesor, String nombres, String apellidos, String email, String especialidad) {
        this.id_profesor = id_profesor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.especialidad = especialidad;
    }

    //Getter & Setter


    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
