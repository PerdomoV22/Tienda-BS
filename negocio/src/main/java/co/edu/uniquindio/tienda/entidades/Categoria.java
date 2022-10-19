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
public class Categoria implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoCategoria;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 300)
    private String descripcion;

    @ToString.Exclude
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    @ManyToMany
    private List<Cliente> clientes;
}
