package com.example.s25672bank.contoller;

import com.example.s25672bank.Exceptions.DatabaseException;
import com.example.s25672bank.Exceptions.validationException;
import com.example.s25672bank.model.Client;
import com.example.s25672bank.service.clientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Client")
@RestController
public class clientController {

    private final clientService clientService;

    public clientController(com.example.s25672bank.service.clientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/addClient")
    public ResponseEntity<Client> addNewClient(@RequestBody Client client) {
        try {
            clientService.addClient(client);
        } catch (validationException validationException) {
            return ResponseEntity.badRequest().build();
        } catch (DatabaseException databaseException) {
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(client);
    }


}
