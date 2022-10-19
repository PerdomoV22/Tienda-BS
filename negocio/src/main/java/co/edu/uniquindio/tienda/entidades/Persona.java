package co.edu.uniquindio.tienda.entidades;

import lombok.*;

import javax.persistence.*;

@MappedSuperclass
@ToString
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Persona {
    @Id
    @EqualsAndHashCode.Include
    private Integer cedula;

    @Column(nullable = false, length = 180)
    private String nombre;

    @Column(nullable = false, unique = true, length = 200)
    private String correo;

    @ToString.Exclude
    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 10)
    private String telefono;

    @Column(nullable = false, length = 200)
    private String direccion;

    @Column(nullable = false)
    private Boolean estado;
}
