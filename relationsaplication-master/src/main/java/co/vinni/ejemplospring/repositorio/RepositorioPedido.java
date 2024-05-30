package co.vinni.ejemplospring.repositorio;

import co.vinni.ejemplospring.entidades.Carro;
import co.vinni.ejemplospring.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositorioPedido extends JpaRepository<Pedido, Integer> {
    Optional<Pedido> findByPediReferencia(String pediReferencia);

}
