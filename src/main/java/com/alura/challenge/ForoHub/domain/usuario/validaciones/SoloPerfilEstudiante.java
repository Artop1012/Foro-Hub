package com.alura.challenge.ForoHub.domain.usuario.validaciones;

import com.alura.challenge.ForoHub.domain.usuario.DatosRegistroUsuario;
import com.alura.challenge.ForoHub.domain.usuario.Perfil;
import jakarta.validation.ValidationException;
import org.springframework.stereotype.Component;

@Component
public class SoloPerfilEstudiante implements ValidadorDeUsuarios {

    @Override
    public void validar(DatosRegistroUsuario datosRegistroUsuario) {

        if (!datosRegistroUsuario.perfil().equalsIgnoreCase(String.valueOf(Perfil.ESTUDIANTE))){
            throw new ValidationException("Sólo se puede registrar como Estudiante");
        }
    }
}
