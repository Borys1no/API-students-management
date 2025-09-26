package com.example.student_management.domain;

public class Usuario {
    private int id_usuario;
    private String username;
    private String password;
    private String email;
    private boolean enabled;

    //Constructor

    public Usuario(int id_usuario, String username, String password, String email, boolean enabled) {
        this.id_usuario = id_usuario;
        this.username = username;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
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
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
