package com.example.s25672bank.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class operations {
    private UUID id;
    private Client client;
}
