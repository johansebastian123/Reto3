package com.grupoG32.reto3.controller;


import com.grupoG32.reto3.dbo.ClientDbo;
import com.grupoG32.reto3.model.ClientModel;
import com.grupoG32.reto3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> obtenerClientes(){
        return null;
        //return clientService.obtenerClientes();
    }

    @PostMapping("/save")
    public String crearClientes(@RequestBody ClientDbo client){
        return null;
        //return clientService.crearClientes(clientModel);
    }
}
