package co.edu.uniquindio.tienda.repositorios;
import co.edu.uniquindio.tienda.entidades.Categoria;
import co.edu.uniquindio.tienda.entidades.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepo extends JpaRepository<Ciudad, Integer>{
}
