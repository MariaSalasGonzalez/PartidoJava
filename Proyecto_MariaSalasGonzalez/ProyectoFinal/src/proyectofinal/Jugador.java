package proyectofinal;
import java.time.LocalDate;

public class Jugador extends Persona {
    private int numCamiseta;
    
    public Jugador(String nombre, LocalDate fechaNacimiento, int numCamiseta){
        super(nombre, fechaNacimiento);
        this.numCamiseta = numCamiseta;
    }

    public int getNumCamiseta(){
        return numCamiseta;
    }
    
    private void setNumCamiseta(int nuCa) {
        this.numCamiseta = nuCa;
    }
}//fin clase