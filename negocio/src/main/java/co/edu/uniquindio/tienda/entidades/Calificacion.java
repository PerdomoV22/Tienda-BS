package co.edu.uniquindio.tienda.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Calificacion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCalificacion;

    @Positive
    @Column(nullable = false)
    private Integer puntuacion;

    @Column(nullable = false, length = 300)
    private String comentario;

    @ManyToOne
    private Producto producto;

    @ManyToOne
    private Cliente cliente;
}
