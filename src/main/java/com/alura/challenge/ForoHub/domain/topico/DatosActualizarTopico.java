package com.alura.challenge.ForoHub.domain.topico;

public record DatosActualizarTopico(
        String titulo,
        String mensaje,
        String nombreCurso,
        Long usuario_id,
        String estado) {
}
