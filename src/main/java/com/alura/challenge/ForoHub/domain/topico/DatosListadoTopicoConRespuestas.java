package com.alura.challenge.ForoHub.domain.topico;

import com.alura.challenge.ForoHub.domain.respuesta.DatosListadoRespuestaEnTopico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public record DatosListadoTopicoConRespuestas(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha_creacion,
        String estado,
        String curso,
        String autor,
        List<DatosListadoRespuestaEnTopico> respuestas) {

    public DatosListadoTopicoConRespuestas(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha_creacion(),
                topico.getEstado().toString(), topico.getCurso().getNombre(), topico.getAutor().getNombre(),
                topico.getRespuestas().stream()
                        .map(r -> new DatosListadoRespuestaEnTopico(r))
                        .collect(Collectors.toList()));
    }
}
