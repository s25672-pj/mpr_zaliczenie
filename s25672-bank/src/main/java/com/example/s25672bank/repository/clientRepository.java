package com.example.s25672bank.repository;


import com.example.s25672bank.model.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class clientRepository {

    private List<Client> clientList = new ArrayList<>();

    public void save(Client client) throws Exception {
        if (clientList.contains(client)) {
            throw new Exception();
        }
        clientList.add(client);
    }

    public Optional<Client> findClientById(int id){
        return clientList.stream().filter(it -> it.getId() == id).findFirst();
    }

    public void removeAll() { clientList = new ArrayList<>();}

    public List<Client> findAll() { return clientList;}

}
