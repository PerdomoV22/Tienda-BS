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
public class Ciudad implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer codigoPostal;

    @Column(nullable = false)
    private String nombreCiudad;

    @ToString.Exclude
    @OneToMany(mappedBy = "ciudad")
    private List<Tienda> tiendas;

    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}
