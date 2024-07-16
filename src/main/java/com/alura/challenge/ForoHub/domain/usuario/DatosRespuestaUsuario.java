package com.alura.challenge.ForoHub.domain.usuario;

public record DatosRespuestaUsuario(
        Long id,
        String nombre,
        String email,
        String perfil) {

    public DatosRespuestaUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getNombre(), usuario.getEmail(), usuario.getPerfil().toString());
    }
}
