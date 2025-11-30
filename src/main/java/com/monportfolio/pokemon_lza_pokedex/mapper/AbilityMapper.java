package com.monportfolio.pokemon_lza_pokedex.mapper;

import com.monportfolio.pokemon_lza_pokedex.dto.AbilityDTO;
import com.monportfolio.pokemon_lza_pokedex.model.Ability;

import java.util.List;
import java.util.Set;

public interface AbilityMapper
{
    AbilityDTO from_EntityAbility_DtoAbilityDto ( Ability ability );

    List<AbilityDTO> toDtoList ( List<Ability> abilities);

    Set<AbilityDTO> toDtoSet ( Set<Ability> abilities);
}
