package com.sda.pantry.model.storage;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
// @Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StockRequirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    @Enumerated(value = EnumType.STRING)
    private AmountType amountType;

    @Enumerated(value = EnumType.STRING)
    private RequirementType type;

    @ManyToOne(fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Product product;

    @ManyToOne()
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Storage storage;
}
