
package matr_uns;
import java.util.Date;
public class Pago {
    private String idPago;
    private Date fechaPago;
    private String metodoPago;
    private String monto;
    private String idConstancia;
    
    public Pago(){}

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getIdConstancia() {
        return idConstancia;
    }

    public void setIdConstancia(String idConstancia) {
        this.idConstancia = idConstancia;
    }
    
    
    
}
