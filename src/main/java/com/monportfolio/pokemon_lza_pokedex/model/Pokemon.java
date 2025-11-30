package com.monportfolio.pokemon_lza_pokedex.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Pokemon
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private int number;
    @Column(unique = true, nullable = false)
    private String name;
    private int generation;
    private String catchRate;
    private double height;
    private double weight;
    private boolean isLegendary = false;


    // B. RELACIÓN ONE-TO-ONE (StatBlock)
    // Un Pokémon tiene un bloque de Stats. CascadeType.ALL asegura que si borras el Pokemon,
    // se borre el StatBlock asociado.
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stat_id", referencedColumnName = "id")
    private StatBlock stats;

    // C. RELACIÓN MANY-TO-MANY (Types) - DUEÑO
    // Un Pokémon puede tener 1 o 2 tipos. Usamos un Set para la relación.

    @ManyToMany
    @JoinTable(
        name = "pokemon_types",
        joinColumns = @JoinColumn(name = "pokemon_id"),
        inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Type> types = new HashSet<>();

    // D. RELACIÓN MANY-TO-MANY (Abilities) - DUEÑO
    // Un Pokémon puede tener varias habilidades.

    @ManyToMany
    @JoinTable(
        name = "pokemon_abilities",
        joinColumns = @JoinColumn(name = "pokemon_id"),
        inverseJoinColumns = @JoinColumn(name = "ability_id")
    )
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Ability> abilities = new HashSet<>();

    // E. RELACIÓN ONE-TO-MANY (Forms) - INVERSA
    // Un Pokémon puede tener muchas formas (Mega, Alola, Galar, etc.)
    // La propiedad 'pokemon' en la clase PokemonForm es la que gestiona el mapeo.
    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<PokemonForm> forms = new HashSet<>();
}
