package com.alura.challenge.ForoHub.infra.errores;

public class ValidacionDeIntegridad extends RuntimeException{

    public ValidacionDeIntegridad(String s){
        super(s);
    }
}
