package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepo extends JpaRepository<Tienda, Integer>{
}
