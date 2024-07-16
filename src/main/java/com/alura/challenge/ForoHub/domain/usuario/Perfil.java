package com.alura.challenge.ForoHub.domain.usuario;

public enum Perfil {

    ADMINISTRADOR("Administrador"),
    MODERADOR("Moderador"),
    INSTRUCTOR("Instructor"),
    AYUDANTE("Ayudante"),
    ESTUDIANTE("Estudiante");

    private String perfil;

    Perfil(String perfil){
        this.perfil = perfil;
    }

    public static Perfil fromString(String text){
        for(Perfil perfil: Perfil.values()){
            if (perfil.perfil.equalsIgnoreCase(text)){
                return perfil;
            }
        }
        throw new IllegalArgumentException("Ningun perfil fue encontrado: " + text);
    }
}
