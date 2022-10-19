package co.edu.uniquindio.tienda.entidades;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@ToString(callSuper = true)
public class Cliente extends Persona implements Serializable {

    @ToString.Exclude
    @ManyToMany(mappedBy = "clientes")
    private List<Categoria> categorias;

    @ManyToMany
    private List<Cupon> cupones;

    @ToString.Exclude
    @OneToMany(mappedBy = "cliente")
    private List<Pqrs> pqrs;

    @ToString.Exclude
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    @ToString.Exclude
    @OneToMany(mappedBy = "cliente")
    private List<Calificacion> calificaciones;
}
