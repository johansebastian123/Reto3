package com.grupoG32.reto3.controller;


import com.grupoG32.reto3.dbo.CarDbo;
import com.grupoG32.reto3.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public List<CarModel> obtenerCarros(){
        return null;
        //return carService.obtenerCarros();
    }

    @PostMapping("/save")
    public String crearCarros(@RequestBody CarDbo car){
        return null;
        //return carService.crearCarros(carModel);
    }
}
