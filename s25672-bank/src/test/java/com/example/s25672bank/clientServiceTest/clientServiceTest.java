package com.example.s25672bank.clientServiceTest;
import com.example.s25672bank.Exceptions.validationException;
import com.example.s25672bank.model.Client;
import com.example.s25672bank.repository.clientRepository;
import com.example.s25672bank.service.clientService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

// import static org.junit.jupiter.api.AssertThrows.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

public class clientServiceTest {

    private clientRepository clientRepository = mock(clientRepository.class);

    private clientService clientService = new clientService(clientRepository);

    @Test
    void shouldCreateNewClient() throws Exception {
        Client client = new Client(0,"Stefan","Kowalski", 1234.50);
        assertDoesNotThrow(() -> clientService.addClient(client));
    }


}



