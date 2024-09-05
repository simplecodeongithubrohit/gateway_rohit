package com.extraaaz.api_gateway.exception;

public class JwtTokenMalformedException extends RuntimeException {
    public JwtTokenMalformedException(String message) {
        super(message);
    }
}
