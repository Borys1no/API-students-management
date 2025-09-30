package com.example.student_management.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_rol")
@IdClass(UsuarioRolId.class)
public class UsuarioRol {
    @Id
    @Column(name = "id_usuario")
    private int id_usuario;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_rol")
    private int id_rol;

    public UsuarioRol(){}

    //constructor


    public UsuarioRol(int id_usuario, int id_rol) {
        this.id_usuario = id_usuario;
        this.id_rol = id_rol;
    }

    //Getter & Setter


    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
}
