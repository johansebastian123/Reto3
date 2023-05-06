package com.grupoG32.reto3.controller;


import com.grupoG32.reto3.dbo.MessageDbo;
import com.grupoG32.reto3.model.MessageModel;
import com.grupoG32.reto3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> obtenerMensajes(){
        return null;
        //return messageService.obtenerMensajes();
    }

    @PostMapping("/save")
    public String crearMensajes(@RequestBody MessageDbo message){
        return null;
        //return messageService.crearMensajes(messageModel);
    }
}
