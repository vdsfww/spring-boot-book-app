package org.example.spring.bookstore.exception;

public class DataProcessingException extends RuntimeException {

    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
