package com.sergiokubo.crud_clientes.services.exceptions;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg){
        super((msg));
    }
}
