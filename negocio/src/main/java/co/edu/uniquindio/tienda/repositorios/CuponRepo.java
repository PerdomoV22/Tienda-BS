package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Cupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuponRepo extends JpaRepository<Cupon, Integer>{
}
