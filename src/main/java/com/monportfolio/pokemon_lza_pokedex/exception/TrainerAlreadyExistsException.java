package com.monportfolio.pokemon_lza_pokedex.exception;

public class TrainerAlreadyExistsException
    extends RuntimeException
{
    public TrainerAlreadyExistsException( String message )
    {
        super( message );
    }
}
