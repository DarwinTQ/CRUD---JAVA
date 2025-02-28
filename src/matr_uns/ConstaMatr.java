
package matr_uns;
import java.util.Date;
/**
 *
 * @author Darwin
 */
public class ConstaMatr {
    private String idConstMatr;
    private Date fechaGeneracion;
    private String idMatriculass;
    private String idUsers;
    
    public ConstaMatr(){}

    public String getIdConstMatr() {
        return idConstMatr;
    }

    public void setIdConstMatr(String idConstMatr) {
        this.idConstMatr = idConstMatr;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getIdMatriculass() {
        return idMatriculass;
    }

    public void setIdMatriculass(String idMatriculass) {
        this.idMatriculass = idMatriculass;
    }

    public String getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(String idUsers) {
        this.idUsers = idUsers;
    }
    
    
}
