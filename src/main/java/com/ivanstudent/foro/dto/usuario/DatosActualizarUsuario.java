package com.ivanstudent.foro.dto.usuario;


import com.ivanstudent.foro.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}
