package proyectofinal;
import java.time.LocalDate;

public class Partido {
    private LocalDate fecha;
    private int numJornada, golFavor, golContra;
    private Arbitro arbitro;
    private String equipoLocal, equipoVisitante;
    
    public Partido(LocalDate fecha, int golFavor, int golContra, int numJornada, Arbitro arbitro,
                    String equipoLocal, String equipoVisitante){
       this.fecha = fecha;
       this.golFavor = golFavor;
       this.golContra = golContra;
       this.numJornada = numJornada;
       this.arbitro = arbitro;
       this.equipoLocal = equipoLocal;
       this.equipoVisitante = equipoVisitante;
    }
    
    public LocalDate getFecha(){
        return fecha;
    }
    
    public int getGolFavor(){
        return golFavor;
    }
    
    public int getGolContra(){
        return golContra;
    }
    
    public int getNumJornada(){
        return numJornada;
    }
    
    public Arbitro getArbitro(){
        return arbitro;
    }
    
    public String getEquipoLocal(){
        return equipoLocal;
    }
            
    public String getEquipoVisitante(){
        return equipoVisitante;
    }
   
    public void setFecha(LocalDate fe){
        this.fecha = fe;
    }
    
    public void setGolFavor(int goFa){
        this.golFavor = goFa;
    }
    
    public void setGolContra(int goCo){
        this.golContra = goCo;
    }
    
    public void setNumJornada(int nuJo){
        this.numJornada = nuJo;
    }
    
    public void setArbitro(Arbitro ar){
        this.arbitro = ar;
    }
    
    public void setEquipoLocal(String eqLo){
        this.equipoLocal = eqLo;
    }
            
    public void setEquipoVisitante(String eqVi){
        this.equipoVisitante = eqVi;
    }
    
    //Metodo Calculo
    public int pts(){
       if(golFavor > golContra){
           golFavor = golFavor + 3;
       }else{
            if(golFavor == golFavor){ 
                golFavor = golFavor + 1;   
            }else{
                if(golFavor < golContra){ 
                    golFavor = golFavor + 0; 
                }
            }
        }
        return golFavor;
    }//fin metodo
    
    public int juegosGanados(){
       int aux = 0;
        if(golFavor > golContra){
            aux = aux + 1;
        }
        return aux;
    }//fin metodo
    
    public int juegosPerdidos(){
        int aux = 0;
        if(golFavor < golContra){
            aux = aux + 1;
        }
        return aux;    
    }//fin metodo
    
     public int empatados(){
         int aux = 0;
        if(golFavor == golFavor){
            aux = aux + 0;
        }
        return aux;
     }//fin metodo
     
      public int jugados(){
         int aux = 0;
        if(golFavor == golFavor){
            aux = aux + 0;
        }
        return aux;
     }//fin metodo
    
    public int diferenciaGoles(){
        int dif = 0;
        dif = getGolFavor() - getGolContra();
        return dif;
    }//fin metodo
}//fin de clase
