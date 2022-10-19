package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepo extends JpaRepository<Entrega, Integer>{
}
