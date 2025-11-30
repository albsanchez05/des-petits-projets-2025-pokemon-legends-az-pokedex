package com.monportfolio.pokemon_lza_pokedex.repository;

import com.monportfolio.pokemon_lza_pokedex.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryType extends JpaRepository<Type, Long>
{
    public boolean existsByName(String name);
}
