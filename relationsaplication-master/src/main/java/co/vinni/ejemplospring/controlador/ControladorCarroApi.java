package co.vinni.ejemplospring.controlador;

import co.vinni.ejemplospring.entidades.Carro;
import co.vinni.ejemplospring.servicios.ServiciosCarro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carros")
public class ControladorCarroApi {

    @Autowired
    ServiciosCarro serviciosCarro;
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Carro> crear(@Validated @RequestBody Carro entityDto) {
        entityDto = serviciosCarro.crear(entityDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(entityDto);
    }


}
