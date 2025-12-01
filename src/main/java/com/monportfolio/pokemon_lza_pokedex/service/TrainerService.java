package com.monportfolio.pokemon_lza_pokedex.service;

import com.monportfolio.pokemon_lza_pokedex.exception.TrainerAlreadyExistsException;
import com.monportfolio.pokemon_lza_pokedex.model.Trainer;
import com.monportfolio.pokemon_lza_pokedex.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TrainerService
{

    @Autowired
    private TrainerRepository trainerRepository;

    public Trainer createTrainer( Trainer trainer) {
        if(trainerRepository.existsByUsername( trainer.getUsername())) {
            throw new TrainerAlreadyExistsException (  "The trainer you are trying to create already exists with ID " + trainer.getUsername());
        } else {
            return trainerRepository.save( trainer );
        }
    }

    public Optional<Trainer> findByUsername ( String username ) {
        return trainerRepository.findByUsername( username );
    }

}
