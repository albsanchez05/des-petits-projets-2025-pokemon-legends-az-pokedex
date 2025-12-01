package com.monportfolio.pokemon_lza_pokedex.controller;

import com.monportfolio.pokemon_lza_pokedex.dto.AbilityDTO;
import com.monportfolio.pokemon_lza_pokedex.mapper.AbilityMapper;
import com.monportfolio.pokemon_lza_pokedex.model.Ability;
import com.monportfolio.pokemon_lza_pokedex.service.AbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/abilities")
public class AbilityController
{
    @Autowired
    private AbilityService abilityService;

    @Autowired
    private AbilityMapper abilityMapper;

    @GetMapping
    public List<AbilityDTO> getAllAbilities () {
        List<Ability> abilityEntity = abilityService.getAllAbilities();

        return abilityEntity.stream()
                            .map( abilityMapper::from_EntityAbility_DtoAbilityDto )
                            .collect(java.util.stream.Collectors.toList());
    }

    @PostMapping
    public Ability createAbility( @RequestBody Ability ability ) {
        return abilityService.createAbility( ability );
    }
}
