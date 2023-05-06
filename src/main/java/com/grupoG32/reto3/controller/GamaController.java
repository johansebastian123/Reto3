package com.grupoG32.reto3.controller;


import com.grupoG32.reto3.dbo.GamaDbo;
import com.grupoG32.reto3.model.GamaModel;
import com.grupoG32.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GamaController {

    @Autowired
   GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> obtenerGamas(){
        return null;
        //return gamaService.obtenerGama();
    }

    @PostMapping("/save")
    public String crearGamas(@RequestBody GamaDbo gama){
        return null;
        //return gamaService.crearGamas(gamaModel);
    }
}
