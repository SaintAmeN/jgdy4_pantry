package com.sda.pantry.model.storage;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
// @Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    private LocalDate birthDate;

    @CreationTimestamp
    private LocalDateTime joinDateTime;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(/*mappedBy = "user",*/ fetch = FetchType.EAGER)
    private Set<Storage> storages;
}
