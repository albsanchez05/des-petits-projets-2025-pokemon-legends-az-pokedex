package com.monportfolio.pokemon_lza_pokedex.exception;

public class PokemonAlreadyExistsException extends RuntimeException
{
    public PokemonAlreadyExistsException( String message )
    {
        super( message );
    }
}
