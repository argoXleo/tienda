package co.vinni.ejemplospring.entidades;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedidos")
@Builder
@ToString
public class Pedido {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pedi_codigo")
    private int codigo;

    @Column(name = "pedi_direccion")
    private String pediDireccion;

    @Column(name = "pedi_referencia" , length = 6)
    private String pediReferencia;

    @Column(name = "pedi_domicilio")
    private String pediDomicilio;

    @Column(name = "pedi_pago")
    private String pediPago;

    @Column(name = "pedi_cantidad")
    private int pediCantidad;

    @ManyToOne
    @JoinColumn(name = "produ_codigo")
    private Producto producto;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPediDireccion() {
        return pediDireccion;
    }

    public void setPediDireccion(String pediDireccion) {
        this.pediDireccion = pediDireccion;
    }

    public String getPediReferencia() {
        return pediReferencia;
    }

    public void setPediReferencia(String pediReferencia) {
        this.pediReferencia = pediReferencia;
    }

    public String getPediDomicilio() {
        return pediDomicilio;
    }

    public void setPediDomicilio(String pediDomicilio) {
        this.pediDomicilio = pediDomicilio;
    }

    public String getPediPago() {
        return pediPago;
    }

    public void setPediPago(String pediPago) {
        this.pediPago = pediPago;
    }

    public int getPediCantidad() {
        return pediCantidad;
    }

    public void setPediCantidad(int pediCantidad) {
        this.pediCantidad = pediCantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
