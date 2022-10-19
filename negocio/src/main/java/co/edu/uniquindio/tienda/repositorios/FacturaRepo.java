package co.edu.uniquindio.tienda.repositorios;

import co.edu.uniquindio.tienda.entidades.Factura;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepo extends JpaRepository<Factura, Integer>{
}
