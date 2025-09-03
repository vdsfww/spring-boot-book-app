package org.example.spring.bookStore.exception;

public class DataException extends RuntimeException {
    public DataException(String message, Throwable cause) {
        super(message, cause);
    }
}
