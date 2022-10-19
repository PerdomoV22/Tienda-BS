package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Integer>{
}
