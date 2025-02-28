package matr_uns;
import java.util.Date;

public class Clase {
    private String idClase;
    private String letraSeccion;
    private Date horario;
    private String aula;
    private String idCurso;
    
    public Clase(){}

    public String getIdClase() {
        return idClase;
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }

    public String getLetraSeccion() {
        return letraSeccion;
    }

    public void setLetraSeccion(String letraSeccion) {
        this.letraSeccion = letraSeccion;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }
    
    
}
