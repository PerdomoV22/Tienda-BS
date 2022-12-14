package co.edu.uniquindio.tienda.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Pqrs implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoPqrs;

    @Column(nullable = false, length = 300)
    private String asunto;

    @Column(nullable = false, length = 300)
    private String descripcion;

    @ManyToOne
    private Cliente cliente;
}
