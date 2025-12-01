package com.monportfolio.pokemon_lza_pokedex.controller;

import com.monportfolio.pokemon_lza_pokedex.model.Trainer;
import com.monportfolio.pokemon_lza_pokedex.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
public class TrainerController
{
    @Autowired
    private TrainerService trainerService;

    @GetMapping("/{username}")
    public Trainer getTrainerByUsername ( @PathVariable String username ) {
        Trainer trainer = trainerService.findByUsername( username )
            .orElseThrow(() -> new RuntimeException(("Trainer " + username + " not found")));
            return trainer;
    }

    @PostMapping
    public Trainer createTrainer(@RequestBody Trainer trainer) {
        return trainerService.createTrainer( trainer );
    }
}
