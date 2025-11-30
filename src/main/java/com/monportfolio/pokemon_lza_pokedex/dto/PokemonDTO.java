package com.monportfolio.pokemon_lza_pokedex.dto;


import lombok.Data;

@Data
public class PokemonDTO
{
    private Long id;
    private int number;
    private String name;
    private int generation;
    private String catchRate;
    private double height;
    private double weight;
    private boolean isLegendary = false;

}
