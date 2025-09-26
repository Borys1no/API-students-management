package com.example.student_management.domain;

import java.util.Date;

public class Calificacion {
    private int id_calificacion;
    private Float nota;
    private Date fecha_registro;

    //Constructor


    public Calificacion(int id_calificacion, Float nota, Date fecha_registro) {
        this.id_calificacion = id_calificacion;
        this.nota = nota;
        this.fecha_registro = fecha_registro;
    }

    //Getter & Setter


    public int getId_calificacion() {
        return id_calificacion;
    }

    public void setId_calificacion(int id_calificacion) {
        this.id_calificacion = id_calificacion;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
