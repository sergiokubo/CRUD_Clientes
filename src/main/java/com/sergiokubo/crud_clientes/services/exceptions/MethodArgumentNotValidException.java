package com.sergiokubo.crud_clientes.services.exceptions;

public class MethodArgumentNotValidException extends RuntimeException {
    public MethodArgumentNotValidException(String msg){
        super((msg));
    }
}
