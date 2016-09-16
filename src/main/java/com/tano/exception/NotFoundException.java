package com.tano.exception;

/**
 * Created by dinamix on 8/8/16.
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
