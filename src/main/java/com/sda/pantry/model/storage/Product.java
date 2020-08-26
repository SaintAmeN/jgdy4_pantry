package com.sda.pantry.model.storage;

import com.sda.pantry.model.recipe.RecipeProduct;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
// @Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<ProductStock> stock;

//    @OneToMany(mappedBy = "product")
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    private Set<StockRequirement> requirements;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<RecipeProduct> recipes;
}
