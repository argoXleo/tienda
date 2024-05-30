package co.vinni.ejemplospring.entidades;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productos")
@Builder
@ToString
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "produ_codigo")
    private int codigo;

    @Column(name = "produ_nombre")
    private String nombreProdu;

    @Column(name = "produ_identificacion", length = 6)
    private long identificacionProdu;

    @Column(name = "produ_cantidad")
    private int cantidadProdu;

    @Column(name = "produ_precio")
    private int precioProdu;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProdu() {
        return nombreProdu;
    }

    public void setNombreProdu(String nombreProdu) {
        this.nombreProdu = nombreProdu;
    }

    public long getIdentificacionProdu() {
        return identificacionProdu;
    }

    public void setIdentificacionProdu(long identificacionProdu) {
        this.identificacionProdu = identificacionProdu;
    }

    public int getCantidadProdu() {
        return cantidadProdu;
    }

    public void setCantidadProdu(int cantidadProdu) {
        this.cantidadProdu = cantidadProdu;
    }

    public int getPrecioProdu() {
        return precioProdu;
    }

    public void setPrecioProdu(int precioProdu) {
        this.precioProdu = precioProdu;
    }
}
