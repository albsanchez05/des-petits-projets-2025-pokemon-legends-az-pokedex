package com.monportfolio.pokemon_lza_pokedex.controller;

import com.monportfolio.pokemon_lza_pokedex.dto.TypeDTO;
import com.monportfolio.pokemon_lza_pokedex.mapper.TypeMapper;
import com.monportfolio.pokemon_lza_pokedex.model.Type;
import com.monportfolio.pokemon_lza_pokedex.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController
{
    @Autowired
    private TypeService typeService;

    @Autowired
    private TypeMapper typeMapper;

    @GetMapping
    public List<TypeDTO> getAllTypes () {
        List<Type> typeEntity = typeService.getAllTypes();
        return typeEntity.stream().map(typeMapper::from_EntityType_DtoTypeDto).collect(java.util.stream.Collectors.toList());
    }

    @PostMapping
    public Type createType( @RequestBody Type type ) {
        return typeService.createType( type );
    }
}
