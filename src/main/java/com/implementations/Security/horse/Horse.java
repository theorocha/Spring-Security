package com.implementations.Security.horse;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "HORSE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Horse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer peso;

    private String nome;

    private String raca;
}
