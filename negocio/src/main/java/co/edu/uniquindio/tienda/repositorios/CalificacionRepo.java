package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionRepo extends JpaRepository<Calificacion, Integer>{
}
