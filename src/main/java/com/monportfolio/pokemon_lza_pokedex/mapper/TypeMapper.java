package com.monportfolio.pokemon_lza_pokedex.mapper;

import com.monportfolio.pokemon_lza_pokedex.dto.TypeDTO;
import com.monportfolio.pokemon_lza_pokedex.model.Type;

import java.util.List;
import java.util.Set;

public interface TypeMapper
{
    TypeDTO from_EntityType_DtoTypeDto ( Type type );

    List<TypeDTO> toDtoList ( List<Type> types);

    Set<TypeDTO> toDtoSet ( Set<Type> types);
}
