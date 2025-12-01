package com.monportfolio.pokemon_lza_pokedex.dto;


import lombok.Data;

@Data
public class PokemonDTO
{
    private Long id;
    private String name;
    private int number;
    private int catch_rate;
    private int generation;
    private boolean is_legendary = false;
    private String image_path;
    private boolean is_registered;

}
