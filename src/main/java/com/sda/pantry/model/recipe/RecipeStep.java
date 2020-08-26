package com.sda.pantry.model.recipe;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
// @Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipeStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int stepNumber;
    private String description;

//    @ManyToOne()
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    private Recipe recipe;

}
