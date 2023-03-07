package proyectofinal;

public class LigaLocal {
    private String nombre;
    private String patrocinadorPrincipal;

    public LigaLocal(String nombre, String patrocinadorPrincipal){
        this.nombre = nombre;
        this.patrocinadorPrincipal = patrocinadorPrincipal;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getPatrocinadorPrincipal(){
        return patrocinadorPrincipal;
    }
    
    private void setNombre(String nom){
        this.nombre = nom;
    }
    
    private void setPatrocinadorPrincipal(String paPri) {
        this.patrocinadorPrincipal = paPri;
    }   
}//fin de clase

