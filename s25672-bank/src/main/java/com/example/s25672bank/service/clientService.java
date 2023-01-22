package com.example.s25672bank.service;


import com.example.s25672bank.Exceptions.DatabaseException;
import com.example.s25672bank.Exceptions.validationException;
import com.example.s25672bank.model.Client;
import org.springframework.stereotype.Service;
import com.example.s25672bank.repository.clientRepository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class clientService {

    private final clientRepository clientReposytory;

    public clientService(clientRepository clientReposytory) {
        this.clientReposytory = clientReposytory;
    }

    public void addClient(Client client){
        if (isInvalid(client.getFirstName())){
            throw new validationException("First name is required");
        }

        if (isInvalid(client.getLastName())){
            throw new validationException("Last name is required");
        }

        if (isInvalidSaldo(client.getSaldo())){
            throw new validationException("Saldo is required");
        }
        try {
            clientReposytory.save(client);
        } catch (Exception e){
            throw new DatabaseException("Database error: ", e);
        }
    }
    public Optional<Client> findById(int id){
        Optional<Client> optionalClient = clientReposytory.findClientById(id);
        return optionalClient;
    }



    public void addMoney(float add, int id){

    }

    public void takeMoney(){

    }


    private boolean isInvalid(String attribute) {
        return attribute == null || attribute.isBlank();
    }
    private boolean isInvalidSaldo(double attribute) {
        return false;
    }
}
