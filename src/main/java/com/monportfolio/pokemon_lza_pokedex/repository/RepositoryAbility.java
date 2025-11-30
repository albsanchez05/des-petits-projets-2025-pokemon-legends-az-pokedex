package com.monportfolio.pokemon_lza_pokedex.repository;

import com.monportfolio.pokemon_lza_pokedex.model.Ability;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAbility extends JpaRepository<Ability, Long>
{
    public boolean existsByName(String name);
}
