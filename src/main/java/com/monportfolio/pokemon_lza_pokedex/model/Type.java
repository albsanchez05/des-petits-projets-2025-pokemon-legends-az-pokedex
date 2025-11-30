package com.monportfolio.pokemon_lza_pokedex.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Type
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "types")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Pokemon> pokemon;


}
