package proyectofinal;
import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    
    public Persona(String nombre, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    private void setNombre(String nom){
        this.nombre = nom;
    }
    
    private void setFechaNacimiento(LocalDate fN){
        this.fechaNacimiento = fN;
    } 
}//fin de clase