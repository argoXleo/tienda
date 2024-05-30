package co.vinni.ejemplospring.operaciones;

import co.vinni.ejemplospring.entidades.Producto;

import java.util.List;

public interface OperacionesProducto {
    public Producto crear(Producto Producto);
    public Producto actualizar(Producto Producto);
    public void borrar(Producto Producto);
    public List<Producto> consultarT();
    public Producto consultarPK(int pk);
}
