package com.monportfolio.pokemon_lza_pokedex.service;

import com.monportfolio.pokemon_lza_pokedex.model.Ability;
import com.monportfolio.pokemon_lza_pokedex.repository.RepositoryAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilityService
{
    @Autowired
    private RepositoryAbility repositoryAbility;

    public List<Ability> getAllAbilities () {
        return repositoryAbility.findAll();
    }

    public Ability createAbility (Ability ability) {
        return repositoryAbility.save( ability );
    }



}
