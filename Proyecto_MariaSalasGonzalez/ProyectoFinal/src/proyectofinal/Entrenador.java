package proyectofinal;
import java.time.LocalDate;

public class Entrenador extends Persona  {
    private int numLicenciaEntrenador;
    
    public Entrenador(String nombre, LocalDate fechaNacimiento, int numLicenciaEntrenador){
        super(nombre, fechaNacimiento);
        this.numLicenciaEntrenador = numLicenciaEntrenador;
    }
    
    public int getNumLicenciaEntrenador(){
        return numLicenciaEntrenador;
    }
    
    private void setNumLicenciaEntrenador(int nuLiEn) {
        this.numLicenciaEntrenador = nuLiEn;
    }   
}//fin de clase

