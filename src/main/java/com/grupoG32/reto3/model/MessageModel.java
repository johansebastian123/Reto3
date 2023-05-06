package com.grupoG32.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.swing.*;

@Entity
@Table(name = "Message")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_message")
    private  int idMessage;
    @Column(name = "message_text",length = 250)
    private  String messageText;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_car", nullable = false)
    private CarModel car;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_client", nullable = false)
    private ClientModel client;

}