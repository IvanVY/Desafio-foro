package com.ivanstudent.foro.dto.curso;


import com.ivanstudent.foro.modelo.Curso;

public record DatosRespuestaCurso(String nombre, String categoria) {

    public DatosRespuestaCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }
}
