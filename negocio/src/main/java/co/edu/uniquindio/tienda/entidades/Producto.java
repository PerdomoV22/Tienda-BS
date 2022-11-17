package co.edu.uniquindio.tienda.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Producto implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoProducto;

    @Column(nullable = false, length = 100)
    private String nombreProducto;

    @Column(nullable = false, length = 200)
    private String descripcion;

    @Positive
    @Column(nullable = false)
    private Double precio;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Talla talla;

    @Column(nullable = false, length = 300)
    private String foto;

    @Column(nullable = false)
    private String marca;

    @ManyToOne
    private Tienda tienda;

    @ToString.Exclude
    @OneToMany(mappedBy = "producto")
    private List<Calificacion> calificaciones;

    @OneToOne
    private Cupon cupon;

    @ManyToOne
    private Categoria categoria;

    @ToString.Exclude
    @ManyToMany(mappedBy = "productos")
    private List<Compra> compras;
}
