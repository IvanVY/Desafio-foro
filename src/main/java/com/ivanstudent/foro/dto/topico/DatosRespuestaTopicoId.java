package com.ivanstudent.foro.dto.topico;


import com.ivanstudent.foro.dto.curso.DatosRespuestaCurso;
import com.ivanstudent.foro.dto.usuario.DatosRespuestaUsuario;
import com.ivanstudent.foro.modelo.Topico;

public record DatosRespuestaTopicoId(Long id, String titulo, String mensaje, String fechaCreacion, String estado, DatosRespuestaUsuario autor,
                                     DatosRespuestaCurso curso) {

    public DatosRespuestaTopicoId(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstado().toString(), new DatosRespuestaUsuario(topico.getAutor()),
                new DatosRespuestaCurso(topico.getCurso()));
    }
}
