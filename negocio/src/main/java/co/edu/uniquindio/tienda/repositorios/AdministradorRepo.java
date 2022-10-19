package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepo extends JpaRepository<Administrador, Integer>{
}
