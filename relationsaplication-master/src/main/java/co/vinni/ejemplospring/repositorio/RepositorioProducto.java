package co.vinni.ejemplospring.repositorio;

import co.vinni.ejemplospring.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProducto extends JpaRepository<Producto, Integer> {
}
