package com.example.s25672bank.Exceptions;


import lombok.Data;

@Data

public class validationException extends RuntimeException {
    private final String message;
}
