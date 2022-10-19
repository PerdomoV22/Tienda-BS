package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, Integer>{
}
