package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Pqrs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PqrsRepo extends JpaRepository<Pqrs, Integer>{
}
