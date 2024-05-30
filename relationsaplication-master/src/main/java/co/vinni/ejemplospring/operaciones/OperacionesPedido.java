package co.vinni.ejemplospring.operaciones;

import co.vinni.ejemplospring.entidades.Carro;
import co.vinni.ejemplospring.entidades.Pedido;

import java.util.List;

public interface OperacionesPedido {
    public Pedido crear(Pedido pedido);
    public Pedido actualizar(Pedido pedido);
    public void borrar(Pedido pedido);
    public List<Pedido> consultarT();
    public Pedido consultarPK(int pk);
}
