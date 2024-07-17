package com.ivanstudent.foro.dto.respuesta;


import com.ivanstudent.foro.dto.topico.DatosRespuestaTopico;
import com.ivanstudent.foro.dto.usuario.DatosRespuestaUsuario;
import com.ivanstudent.foro.modelo.Respuesta;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
