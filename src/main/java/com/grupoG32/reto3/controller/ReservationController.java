package com.grupoG32.reto3.controller;


import com.grupoG32.reto3.dbo.ReservationDbo;
import com.grupoG32.reto3.model.ReservationModel;
import com.grupoG32.reto3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationModel> obtenerReservaciones(){
        return null;
        //return reservationService.obtenerReservaciones();
    }

    @PostMapping("/save")
    public String crearReservaciones(@RequestBody ReservationDbo reservation){
        return null;
        //return reservationService.crearReservaciones(reservationModel);
    }
}
