package co.vinni.ejemplospring.controlador;

import co.vinni.ejemplospring.entidades.Carro;
import co.vinni.ejemplospring.entidades.Pedido;
import co.vinni.ejemplospring.servicios.ServiciosCarro;
import co.vinni.ejemplospring.servicios.ServiciosPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class ControladorPedidoApi {

    @Autowired
    ServiciosPedido serviciosPedido;
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Pedido> crear(@Validated @RequestBody Pedido entityDto) {
        entityDto = serviciosPedido.crear(entityDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(entityDto);
    }
}
