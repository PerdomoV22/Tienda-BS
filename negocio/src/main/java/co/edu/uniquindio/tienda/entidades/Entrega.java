package co.edu.uniquindio.tienda.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Entrega implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEntrega;

    @Column(nullable = false)
    private LocalDateTime fechaLimite;

    @Column(nullable = false, length = 200)
    private String direccion;

    @Positive
    @Column(nullable = false)
    private Integer diasHabiles;

    @Column(nullable = false)
    private Boolean estado;

    @Positive
    @Column(nullable = false)
    private double precio;

    @ToString.Exclude
    @OneToOne(mappedBy = "entrega")
    private Compra compra;
}
