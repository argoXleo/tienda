package co.vinni.ejemplospring.controlador;

import co.vinni.ejemplospring.entidades.Producto;
import co.vinni.ejemplospring.entidades.Propietario;
import co.vinni.ejemplospring.servicios.ServiciosProducto;
import co.vinni.ejemplospring.servicios.ServiciosPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorProducto {

    @Autowired
    ServiciosProducto serviciosProducto;

    @GetMapping({  "/producto/lista"})
    public String listarProductos(Model model){
        model.addAttribute("listaproductoT",serviciosProducto.consultarT());

        return "listaproductos";
    }

    @GetMapping({  "/producto/nuevo"})
    public String cargarProductoModal(Model model){
        Producto productollenar = new Producto();
        model.addAttribute("productollenar",productollenar);

        return "formcreaproducto";
    }
    @PostMapping ({"/producto/accioncrear"})
    public String crearProductoModal(@ModelAttribute("productollenar") Producto producto){
        this.serviciosProducto.crear(producto);

        return "redirect:/producto/lista";
    }

}
