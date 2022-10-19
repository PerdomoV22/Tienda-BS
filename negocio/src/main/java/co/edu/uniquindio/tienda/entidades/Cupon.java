package co.edu.uniquindio.tienda.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Cupon implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Positive
    @Column(nullable = false)
    private Double valorDescuento;

    @Column(nullable = false)
    private LocalDate fechaVencimiento;

    @Column(nullable = false, length = 100)
    private String criterio;

    @Column(nullable = false, length = 100)
    private String descripcion;

    @ToString.Exclude
    @OneToOne(mappedBy = "cupon")
    private Producto producto;

    @ToString.Exclude
    @ManyToMany(mappedBy = "cupones")
    private List<Cliente> clientes;
}
