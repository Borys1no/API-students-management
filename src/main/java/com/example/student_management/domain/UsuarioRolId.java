package com.example.student_management.domain;

import java.io.Serializable;
import java.util.Objects;

public class UsuarioRolId implements Serializable {
    private  int idUsuario;
    private int idRol;

    public UsuarioRolId(){}

    public UsuarioRolId(int idUsuario, int idRol) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
    }

    @Override
    public boolean equals (Object o){
        if(this == o ) return  true;
        if(o == null || getClass() != o.getClass()) return false;
        UsuarioRolId that = (UsuarioRolId) o;
        return idUsuario == that.idUsuario && idRol == that.idRol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idRol);
    }
}
