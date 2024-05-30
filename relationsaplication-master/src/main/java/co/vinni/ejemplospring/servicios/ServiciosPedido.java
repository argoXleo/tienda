package co.vinni.ejemplospring.servicios;

import co.vinni.ejemplospring.entidades.Carro;
import co.vinni.ejemplospring.entidades.Pedido;
import co.vinni.ejemplospring.operaciones.OperacionesCarro;
import co.vinni.ejemplospring.operaciones.OperacionesPedido;
import co.vinni.ejemplospring.repositorio.RepositorioCarro;
import co.vinni.ejemplospring.repositorio.RepositorioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosPedido implements OperacionesPedido {

    @Autowired
    RepositorioPedido repositorioPedido ;

    @Override
    public Pedido crear(Pedido pedido) {
        return repositorioPedido.save(pedido);
    }

    @Override
    public Pedido actualizar(Pedido pedido) {

        if (this.consultarPK(pedido.getCodigo()) != null)
            return repositorioPedido.save(pedido);
        return null;
    }

    @Override
    public void borrar(Pedido pedido) {
         repositorioPedido.delete(pedido);;
    }

    @Override
    public List<Pedido> consultarT() {
        return repositorioPedido.findAll();
    }

    @Override
    public Pedido consultarPK(int pk) {
        return repositorioPedido.findById(pk).orElse(null);

    }
}
