package com.monportfolio.pokemon_lza_pokedex.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ability
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;
    private String description;

    @ManyToMany(mappedBy = "abilities")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Pokemon> pokemon;
}
