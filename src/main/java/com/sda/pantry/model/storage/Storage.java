package com.sda.pantry.model.storage;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private StorageType type;

    private String name;

//    @ManyToOne()
//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    private AppUser user;

    @OneToMany(/*mappedBy = "storage",*/ fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<ProductStock> stock;

    @OneToMany(mappedBy = "storage", fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<StockRequirement> requirements;
}
