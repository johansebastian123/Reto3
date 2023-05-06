package com.grupoG32.reto3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @Column(length = 45)
    private  String messageText;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_car", nullable = false)
    private CarModel car;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client", nullable = false)
    private ClientModel client;
}