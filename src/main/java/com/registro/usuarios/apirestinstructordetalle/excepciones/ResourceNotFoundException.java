package com.registro.usuarios.apirestinstructordetalle.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ResourceNotFoundException(){

    }
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
    public ResourceNotFoundException(String mensaje, Throwable error){
        super(mensaje, error);
    }

}
