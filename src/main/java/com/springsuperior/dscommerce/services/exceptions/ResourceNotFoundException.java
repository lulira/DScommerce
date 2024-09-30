package com.springsuperior.dscommerce.services.exceptions;

// a RuntimeException não exige o try catch por isso foi a classe excolhida para a captura das exceções.
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException( String msg) {

        super(msg);
    }
}
