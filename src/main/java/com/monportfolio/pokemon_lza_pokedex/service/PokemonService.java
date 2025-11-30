package com.monportfolio.pokemon_lza_pokedex.service;

import com.monportfolio.pokemon_lza_pokedex.exception.PokemonAlreadyExistsException;
import com.monportfolio.pokemon_lza_pokedex.model.Pokemon;
import com.monportfolio.pokemon_lza_pokedex.repository.RepositoryPokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

@Service
public class PokemonService
{

    @Autowired
    private RepositoryPokemon repositoryPokemon;

    public Page<Pokemon> getAllPokemon( Pageable pageable ) {
        return repositoryPokemon.findAll( pageable );
    }

    public Optional<Pokemon> getPokemonById ( Long id) {
        return repositoryPokemon.findById( id );
    }

    public Pokemon createPokemon(Pokemon pokemon) {
        if(repositoryPokemon.existsByNumber( pokemon.getNumber() )) {
            throw new PokemonAlreadyExistsException( "The pokemon you are trying to create already exists with ID " + pokemon.getNumber() );
        } else {
            return repositoryPokemon.save(pokemon);
        }
    }

    public Pokemon updatePokemon(Long id, Pokemon detailsPokemon) {
        return repositoryPokemon.findById( id ).map(pokemon ->  {
            pokemon.setNumber( detailsPokemon.getNumber() );
            pokemon.setName( detailsPokemon.getName() );
            pokemon.setGeneration( detailsPokemon.getGeneration() );
            pokemon.setCatchRate( detailsPokemon.getCatchRate() );
            pokemon.setHeight( detailsPokemon.getHeight() );
            pokemon.setWeight( detailsPokemon.getWeight() );
            pokemon.setLegendary( detailsPokemon.isLegendary() );
            return repositoryPokemon.save( pokemon );
        }).orElseThrow(() -> new RuntimeException("Pokemon n." + id + "not found"));
    }

    public void deletePokemon(Long id) {
        if (repositoryPokemon.existsById( id )) {
            repositoryPokemon.deleteById( id );
        } else {
            throw new RuntimeException("Pokemon n." + id + "not found");
        }
        System.out.println("Pokemon n." + id + " deleted");
    }




}
