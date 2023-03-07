package proyectofinal;
import java.util.ArrayList;

public class EquipoFootball {
    private String nombre, ciudad, nombreEstadio;
    private Entrenador entrenador;
    private LigaLocal ligaLocal;
    private ArrayList<Jugador> listaJugadores; 
    
    public EquipoFootball(String nombre, String ciudad, String nombreEstadio,
                            Entrenador entrenador, LigaLocal ligaLocal){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.nombreEstadio = nombreEstadio;
        this.entrenador = entrenador;
        this.ligaLocal = ligaLocal;
        this.listaJugadores = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    
    public String getNombreEstadio(){
        return nombreEstadio;
    }
    
    public Entrenador getEntrenador(){
        return entrenador;
    }
    
    public LigaLocal getLigaLocal(){
        return ligaLocal;
    }
    
    public ArrayList<Jugador> getJugadores() {
        return listaJugadores;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void setCiudad(String ciu){
        this.ciudad = ciu;
    }
    
    public void setNombreEstadio(String noEs){
        this.nombreEstadio = noEs;
    }

    public void setJugadores(ArrayList<Jugador> listJug) {
        this.listaJugadores = listJug;
    }
    
    public void setEntrenador(Entrenador en){
        this.entrenador = en;
    }
    
    public void setLigaLocal(LigaLocal liLo){
        this.ligaLocal = liLo;
    }
    
    //MetodosCalculo
    public void agregarJugador(Jugador jugador){
        if(!listaJugadores.contains(jugador)){
            listaJugadores.add(jugador);
        }else{
            System.out.println("Jugador ya se encuentra agregado");
        }
    }//fin metodo 
}//fin de clase