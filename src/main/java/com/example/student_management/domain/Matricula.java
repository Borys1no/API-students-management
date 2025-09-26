package com.example.student_management.domain;


import java.util.Date;

public class Matricula {
    private int id_matricula;
    private Date fecha_matricula;


    //Constructor
    public Matricula(int id_matricula, Date fecha_matricula) {
        this.id_matricula = id_matricula;
        this.fecha_matricula = fecha_matricula;
    }

    //Getter & Setter


    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public Date getFecha_matricula() {
        return fecha_matricula;
    }

    public void setFecha_matricula(Date fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }
}
