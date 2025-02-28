
package matr_uns;
import java.util.Date;
public class ConstanciaPago {
    private String idConstancia;
    private Date fechaGeneracion;
    private String monto;
    private String estadoPago;
    private int cui;
    
    public ConstanciaPago(){}

    public String getIdConstancia() {
        return idConstancia;
    }

    public void setIdConstancia(String idConstancia) {
        this.idConstancia = idConstancia;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }
    
    
}
