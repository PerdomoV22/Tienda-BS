package co.edu.uniquindio.tienda.entidades;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@ToString(callSuper = true)
public class Administrador extends Persona implements Serializable {

    @ToString.Exclude
    @OneToOne(mappedBy = "administrador")
    private Tienda tienda;
}
