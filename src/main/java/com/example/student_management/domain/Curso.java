package com.example.student_management.domain;

public class Curso {
    private int id_curso;
    private String nombre;
    private String descripcion;
    private int creditos;

    //Constructor


    public Curso(int id_curso, String nombre, String descripcion, int creditos) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditos = creditos;
    }

    //Getter & Setter


    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
