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
public class Tienda implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoTienda;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 300)
    private String direccion;

    @Column(nullable = false, length = 10)
    private String telefono;

    @ManyToOne
    private Ciudad ciudad;

    @ToString.Exclude
    @OneToMany(mappedBy = "tienda")
    private List<Producto> productos;

    @OneToOne
    private Administrador administrador;

}
