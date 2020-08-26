package com.sda.pantry.model.recipe;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
// @Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(/*mappedBy = "recipe",*/ fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<RecipeStep> recipeSteps;

    @OneToMany(/*mappedBy = "recipe",*/ fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<RecipeProduct> productAmounts;
}
