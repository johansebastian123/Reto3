package com.grupoG32.reto3.dbo;

import com.grupoG32.reto3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDbo {

    private  int idClient;
    private  String name;
    private  String email;
    private  String password;
    private  byte age;

    private ClientModel client;

}