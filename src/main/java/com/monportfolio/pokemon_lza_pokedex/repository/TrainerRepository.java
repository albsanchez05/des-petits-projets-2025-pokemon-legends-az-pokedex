package com.monportfolio.pokemon_lza_pokedex.repository;

import com.monportfolio.pokemon_lza_pokedex.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainerRepository extends JpaRepository<Trainer, Long>
{
    Optional<Trainer> findByUsername( String username);

    public boolean existsByUsername (String username);
}
