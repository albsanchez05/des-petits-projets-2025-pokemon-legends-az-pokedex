package com.monportfolio.pokemon_lza_pokedex.mapper;

import com.monportfolio.pokemon_lza_pokedex.dto.PokemonDTO;
import com.monportfolio.pokemon_lza_pokedex.model.Pokemon;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring", uses = {TypeMapper.class, AbilityMapper.class})
public interface PokemonMapper
{
    PokemonDTO from_EntityPokemon_DtoPokemonoDto( Pokemon pokemon );

    List<PokemonDTO> toDtoList ( List<Pokemon> pokemons );

    Set<PokemonDTO> toDtoSet ( Set<Pokemon> pokemons);
}
