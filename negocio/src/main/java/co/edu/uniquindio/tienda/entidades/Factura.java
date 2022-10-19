package co.edu.uniquindio.tienda.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Factura implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoFactura;

    @Column(nullable = false, length = 200)
    private String descripcion;

    @ToString.Exclude
    @OneToMany(mappedBy = "factura")
    private List<Compra> compras;
}
