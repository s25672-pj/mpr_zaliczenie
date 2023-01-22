package com.example.s25672bank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@With


public class Client {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double saldo;
}
