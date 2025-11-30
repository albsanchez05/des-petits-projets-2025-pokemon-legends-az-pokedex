package com.monportfolio.pokemon_lza_pokedex.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PokemonForm
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String formName;

    private boolean alolanForm = false;
    private boolean galarianForm = false;
    private boolean megaEvolution = false;

    // RELACIÓN MUCHOS A UNO (MANY TO ONE)
    // Muchas formas pertenecen a un solo Pokémon (especie base).
    // Esta es la entidad dueña, contiene la FK 'pokemon_id'.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pokemon_id", nullable = false)
    @ToString.Exclude // Necesario para evitar recursividad
    @EqualsAndHashCode.Exclude // Necesario para evitar recursividad
    private Pokemon pokemon;
}
