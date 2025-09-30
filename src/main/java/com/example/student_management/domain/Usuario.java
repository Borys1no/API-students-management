package com.example.student_management.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    private String username;
    private String password;
    private String email;
    private boolean enable = true;

    public Usuario(){}

    //Constructor

    public Usuario( String username, String password, String email, boolean enable) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.enable = enable;
    }

    //Getter & Setter


    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enable;
    }

    public void setEnabled(boolean enable) {
        this.enable = enable;
    }
}
