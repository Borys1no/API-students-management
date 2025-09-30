package com.example.student_management.dto;

import java.util.List;

public class UsuarioDto {
    private String username;
    private String password;
    private String email;
    private List<Integer> roles;

    public UsuarioDto(){}

    public UsuarioDto(String username, String password, List<Integer> roles, String email) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.email = email;
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

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }
}
