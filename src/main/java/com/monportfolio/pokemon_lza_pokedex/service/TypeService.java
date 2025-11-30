package com.monportfolio.pokemon_lza_pokedex.service;

import com.monportfolio.pokemon_lza_pokedex.mapper.AbilityMapper;
import com.monportfolio.pokemon_lza_pokedex.model.Type;
import com.monportfolio.pokemon_lza_pokedex.repository.RepositoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService
{
    @Autowired
    private RepositoryType repositoryType;

    @Autowired
    private AbilityMapper abilityMapper;

    public List<Type> getAllTypes() {
        return repositoryType.findAll();
    }

    public Type saveType(Type type) {
        if(repositoryType.existsByName(Type.getName())
    }
}
