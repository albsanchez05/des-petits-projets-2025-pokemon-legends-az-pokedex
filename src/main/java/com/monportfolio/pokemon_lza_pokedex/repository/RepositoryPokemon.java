package com.monportfolio.pokemon_lza_pokedex.repository;

import com.monportfolio.pokemon_lza_pokedex.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPokemon extends JpaRepository<Pokemon, Long>
{

    public boolean existsByNumber(int number);
}
