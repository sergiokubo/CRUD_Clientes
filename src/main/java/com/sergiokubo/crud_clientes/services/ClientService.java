package com.sergiokubo.crud_clientes.services;

import com.sergiokubo.crud_clientes.dto.ClientDTO;
import com.sergiokubo.crud_clientes.entities.Client;
import com.sergiokubo.crud_clientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository repository;
    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        ClientDTO dto = new ClientDTO(client);
        return dto;
    }
}
