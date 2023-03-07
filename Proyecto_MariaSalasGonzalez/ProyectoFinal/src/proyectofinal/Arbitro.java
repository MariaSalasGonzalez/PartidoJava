package proyectofinal;
import java.time.LocalDate;

public class Arbitro extends Persona {
    private int partidosParticipados;
    
    public Arbitro(String nombre, LocalDate fechaNacimiento, int partidosParticipados){
        super(nombre, fechaNacimiento);
        this.partidosParticipados = partidosParticipados;
    }
    
    public int getPartidosParticipados(){
        return partidosParticipados;
    }
    
    private void setPartidosParticipados(int paPar) {
        this.partidosParticipados = paPar;
    }
}//fin de clase

