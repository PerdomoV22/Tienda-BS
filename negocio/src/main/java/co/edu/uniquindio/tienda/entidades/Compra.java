package co.edu.uniquindio.tienda.entidades;

import lombok.*;
import org.hibernate.hql.internal.ast.tree.IdentNode;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Compra implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCompra;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MedioPago medioPago;

    @Column(nullable = false)
    private LocalDateTime fechaCompra;

    @Positive
    @Column(nullable = false)
    private Double valorTotal;

    @ToString.Exclude
    @ManyToMany
    private List<Producto> productos;

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    private Entrega entrega;

    @ManyToOne
    private Factura factura;
}
