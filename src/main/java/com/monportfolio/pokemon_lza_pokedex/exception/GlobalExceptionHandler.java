package com.monportfolio.pokemon_lza_pokedex.exception;

import com.monportfolio.pokemon_lza_pokedex.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler( PokemonAlreadyExistsException.class )
    public ResponseEntity<ErrorDTO> handlePokemonAlreadyExistsException( PokemonAlreadyExistsException ex )
    {

        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setMessage( ex.getMessage() );
        errorDTO.setExceptionType( ex.getClass().getSimpleName() );

        return new ResponseEntity<>( errorDTO, HttpStatus.CONFLICT );
    }
}