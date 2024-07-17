package com.ivanstudent.foro.dto.usuario;


import com.ivanstudent.foro.modelo.Usuario;

public record DatosListadoUsuario(Long id, String nombre, String email, String tipo) {

    public DatosListadoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNombre(), usuario.getEmail(), usuario.getTipo().toString());
    }
}
