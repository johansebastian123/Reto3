package com.grupoG32.reto3.controller;


import com.grupoG32.reto3.dbo.ScoreDbo;
import com.grupoG32.reto3.model.ScoreModel;
import com.grupoG32.reto3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreModel> obtenerScores(){
        return null;
        //return scoreService.obtenerScores();
    }

    @PostMapping("/save")
    public String crearScores(@RequestBody ScoreDbo score){
        return null;
        //return scoreService.crearScores(scoreModel);
    }
}
