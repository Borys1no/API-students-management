package com.example.student_management.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_rol")
@IdClass(UsuarioRolId.class)
public class UsuarioRol {
    @Id
    @Column(name = "id_usuario")
    private int idUsuario;



    @Id
    @Column(name = "id_rol")
    private int idRol;

    public UsuarioRol(){}


    //constructor


    public UsuarioRol(int idUsuario, int idRol) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
    }

    //Getter & Setter


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
}
