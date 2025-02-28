
package matr_uns;
import java.util.Date;
public class DetalleMatriculass {
    private String idDetalle;
    private Date fechaSeleccion;
    private String idMatriculass;
    private String idClase;
    private String usersIdUsers;
    
    public DetalleMatriculass(){}

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Date getFechaSeleccion() {
        return fechaSeleccion;
    }

    public void setFechaSeleccion(Date fechaSeleccion) {
        this.fechaSeleccion = fechaSeleccion;
    }

    public String getIdMatriculass() {
        return idMatriculass;
    }

    public void setIdMatriculass(String idMatriculass) {
        this.idMatriculass = idMatriculass;
    }

    public String getIdClase() {
        return idClase;
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }

    public String getUsersIdUsers() {
        return usersIdUsers;
    }

    public void setUsersIdUsers(String usersIdUsers) {
        this.usersIdUsers = usersIdUsers;
    }
    
    
    
}
