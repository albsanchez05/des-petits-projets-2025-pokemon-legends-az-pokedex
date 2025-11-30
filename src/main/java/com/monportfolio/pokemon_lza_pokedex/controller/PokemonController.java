package com.monportfolio.pokemon_lza_pokedex.controller;

import com.monportfolio.pokemon_lza_pokedex.dto.PokemonDTO;
import com.monportfolio.pokemon_lza_pokedex.mapper.PokemonMapper;
import com.monportfolio.pokemon_lza_pokedex.model.Pokemon;
import com.monportfolio.pokemon_lza_pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/pokemon")
public class PokemonController
{
    @Autowired
    private PokemonService pokemonService;

    @Autowired
    private PokemonMapper pokemonMapper;

    @GetMapping
    public Page<PokemonDTO> getAllPokemon( Pageable pageable )
    {
        Page<Pokemon> pokemonEntity = pokemonService.getAllPokemon( pageable );

        return pokemonEntity.map( pokemonMapper::from_EntityPokemon_DtoPokemonoDto );
    }

    @GetMapping("/{id}")
    public PokemonDTO getPokemoById ( @PathVariable Long id ) {
        Pokemon pokemon = pokemonService.getPokemonById( id )
            .orElseThrow(() -> new RuntimeException("Pokemon n." + id + " not found"));
        return pokemonMapper.from_EntityPokemon_DtoPokemonoDto( pokemon );
    }

    @PostMapping
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.createPokemon( pokemon );
    }

    @PutMapping("/{id}")
    public void updatePokemon (@PathVariable Long id, @RequestBody Pokemon pokemon) {
        pokemonService.updatePokemon( id, pokemon );
    }

    @DeleteMapping("/{id}")
    public void deletePokemon(@PathVariable Long id) {
        pokemonService.deletePokemon( id );
    }

}

