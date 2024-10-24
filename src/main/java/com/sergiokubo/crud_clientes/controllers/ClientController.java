package com.sergiokubo.crud_clientes.controllers;

import com.sergiokubo.crud_clientes.dto.ClientDTO;
import com.sergiokubo.crud_clientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService service;
    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        ClientDTO dto = service.findById(id);
        return dto;
    }
}
