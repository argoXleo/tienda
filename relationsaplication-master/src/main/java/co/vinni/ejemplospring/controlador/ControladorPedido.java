package co.vinni.ejemplospring.controlador;

import co.vinni.ejemplospring.entidades.Pedido;
import co.vinni.ejemplospring.entidades.Producto;
import co.vinni.ejemplospring.servicios.ServiciosPedido;
import co.vinni.ejemplospring.servicios.ServiciosProducto;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorPedido {

    @Autowired
    ServiciosPedido serviciosPedido;
    @Autowired
    ServiciosProducto serviciosProducto;



    @GetMapping({  "/pedido/lista"})
    public String listarEquipos(Model model){
        model.addAttribute("listapedidosT",serviciosPedido.consultarT());

        for (Pedido elpedido : serviciosPedido.consultarT()){
            System.out.println( elpedido);
        }
        System.out.println("Paso por aca");
        return "listapedidos";
    }

    @GetMapping({  "/pedido/nuevo"})
    public String cargarPedidoModal(Model model){
        Pedido pedidollenar = new Pedido();
        Producto productollenar = new Producto();

        pedidollenar.setProducto(productollenar);
        model.addAttribute("pedidollenar",pedidollenar);
        model.addAttribute("listaproductos",this.serviciosProducto.consultarT());


        System.out.println("Paso por aca formulario");
        return "formcreapedido";
    }

    @PostMapping({  "/pedido/accioncrear"})
    public String accioncrear(@ModelAttribute("pedidollenar") Pedido pedido){
        System.out.println("Paso por aca para guardar formulario");
        System.out.println(pedido);



        this.serviciosPedido.crear(pedido);
        return "redirect:/pedido/lista";
    }



    public Pedido crearPedido(Pedido pedido){
        return serviciosPedido.crear(pedido);
    }

    public Pedido buscarPedido(int pk){
        Pedido pedido = serviciosPedido.consultarPK(pk);


        /*if(carro != null){
            Moto moto = serviciosMoto.consultarPK(carro.getIdmoto());
            return  Carro
                    .builder()
                    .placa(carro.getPlaca())
                    .moto(moto)
                    .build();
        }*/
        return null;
    }
}


