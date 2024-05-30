package co.vinni.ejemplospring.servicios;

import co.vinni.ejemplospring.entidades.Producto;
import co.vinni.ejemplospring.entidades.Propietario;
import co.vinni.ejemplospring.operaciones.OperacionesProducto;
import co.vinni.ejemplospring.operaciones.OperacionesPropietario;
import co.vinni.ejemplospring.repositorio.RepositorioProducto;
import co.vinni.ejemplospring.repositorio.RepositorioPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosProducto implements OperacionesProducto {

    @Autowired
    RepositorioProducto repositorioProducto ;
    

    @Override
    public Producto crear(Producto producto) {
        return repositorioProducto.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        if (this.consultarPK(producto.getCodigo()) != null)
            return repositorioProducto.save(producto);
        return null;
    }

    @Override
    public void borrar(Producto producto) {
        repositorioProducto.delete(producto);;
    }

    @Override
    public List<Producto> consultarT() {
        return repositorioProducto.findAll();
    }

    @Override
    public Producto consultarPK(int pk) {
        return repositorioProducto.findById(pk).orElse(null);
    }
}
