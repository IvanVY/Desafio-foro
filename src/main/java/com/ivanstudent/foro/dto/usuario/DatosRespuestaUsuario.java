package com.ivanstudent.foro.dto.usuario;


import com.ivanstudent.foro.modelo.Usuario;

public record DatosRespuestaUsuario(String nombre, String email, String tipo) {

    public DatosRespuestaUsuario(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getTipo().toString());
    }
}
