package com.example.s25672bank.Exceptions;

import lombok.Data;

@Data
public class DatabaseException extends RuntimeException {
    private final String massage;
    private final Exception exception;
}
