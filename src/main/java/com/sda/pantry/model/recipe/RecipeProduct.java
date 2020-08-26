package com.sda.pantry.model.recipe;

import com.sda.pantry.model.storage.AmountType;
import com.sda.pantry.model.storage.Product;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
// @Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipeProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    @Enumerated(value = EnumType.STRING)
    private AmountType amountType;

//    @ManyToOne()
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    private Recipe recipe;

    @ManyToOne(fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Product product;
}
