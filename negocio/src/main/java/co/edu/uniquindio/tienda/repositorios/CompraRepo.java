package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepo extends JpaRepository<Compra, Integer>{
}
