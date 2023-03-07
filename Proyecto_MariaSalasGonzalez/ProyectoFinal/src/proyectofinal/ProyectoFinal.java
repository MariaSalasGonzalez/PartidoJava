package proyectofinal;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProyectoFinal {
    public static void main(String[] args) {  
      Entrenador JafetSoto = new Entrenador("JafetSoto", LocalDate.of(1995,1,3), 2345); 
      Entrenador AndresCarevic = new Entrenador("AndresCarevic", LocalDate.of(1995,1,3), 6755);
      Entrenador GeinerSegura = new Entrenador("GeinerSegura", LocalDate.of(2000,5,8), 8769);
      Entrenador MauricioWright = new Entrenador("MauricioWright", LocalDate.of(1991,8,2), 1114);
      
      LigaLocal LigaPromerica = new LigaLocal("Liga Promerica", "Coca Cola");
      
      EquipoFootball h = new EquipoFootball("CSH", "Heredia", "Rosabal", JafetSoto, LigaPromerica); 
      EquipoFootball a = new EquipoFootball("Liga", "Alajuela", "Alejandro Morera Soto", AndresCarevic, LigaPromerica);
      EquipoFootball c = new EquipoFootball("Cartago", "Cartago", "Fello Meza", GeinerSegura, LigaPromerica);
      EquipoFootball s = new EquipoFootball("Saprissa", "San Jose", "Ricardo Saprissa", MauricioWright, LigaPromerica);
      
      Arbitro Pedro = new Arbitro("Pedro", LocalDate.of(1993,4,5), 4); 
      
      Partido ah = new Partido(LocalDate.of(2021,9,5), 5, 3, 1, Pedro, "Alajuela", "Heredia"); 
      Partido ha = new Partido(LocalDate.of(2021,9,19), 2, 2, 1, Pedro, "Heredia", "Alajuela");
      Partido cs = new Partido(LocalDate.of(2021,9,19), 7, 5, 1, Pedro, "Cartago", "Saprissa");  
      Partido sc = new Partido(LocalDate.of(2021,9,19), 8, 6, 1, Pedro, "Saprissa", "Cartago"); 
      
      Jugador jug1 = new Jugador("Mauricio", LocalDate.of(1997,5,2), 1);
      Jugador jug2 = new Jugador("Pablo", LocalDate.of(1995,2,6), 2);
      Jugador jug3 = new Jugador("Luis", LocalDate.of(2000,6,9), 3);
      Jugador jug4 = new Jugador("Alvaro", LocalDate.of(1991,9,8), 4);
      
      h.agregarJugador(jug1);
      a.agregarJugador(jug2);
      c.agregarJugador(jug3);
      s.agregarJugador(jug4);
      
      int favor = (ah.getGolFavor()+ ha.getGolFavor());
      int contra =(ah.getGolContra() + ha.getGolContra());
      int diferencia =(ah.diferenciaGoles() + ah.diferenciaGoles());
      int perdidos =(ah.juegosPerdidos() + ah.juegosPerdidos());
      int ganados= (ah.juegosGanados() + ah.juegosGanados());
      int empatados =(ah.empatados() + ah.empatados());
      
      int favor2 = (cs.getGolFavor()+ sc.getGolFavor());
      int contra2 =(cs.getGolContra() + sc.getGolContra());
      int diferencia2 =(cs.diferenciaGoles() + sc.diferenciaGoles());
      int perdidos2 =(cs.juegosPerdidos() + sc.juegosPerdidos());
      int ganados2 = (cs.juegosGanados() + sc.juegosGanados());
      int empatados2 =(cs.empatados() + sc.empatados()); 
      
     
        //Heredia
        System.out.println("1. Equipo: " + h.getNombre()); 
        System.out.println("2. MP: " + ah.getNumJornada()); 
        System.out.println("3. D: " + empatados);   
        System.out.println("4. W: " + ganados); 
        System.out.println("5. L: " + perdidos); 
        System.out.println("6. GF: " + favor);  
        System.out.println("7. GA: " + contra); 
        System.out.println("8. GD: " + diferencia);  
        System.out.println("9. Pts: " + ha.pts()); 
        System.out.println("");

        //Alajuela
        System.out.println("1. Equipo: " + a.getNombre());
        System.out.println("2. MP: " + ah.getNumJornada()); 
        System.out.println("3. D: " + empatados);   
        System.out.println("4. W: " + ganados); 
        System.out.println("5. L: " + perdidos); 
        System.out.println("6. GF: " + favor);  
        System.out.println("7. GA: " + contra); 
        System.out.println("8. GD: " + diferencia);  
        System.out.println("9. Pts: " + ah.pts()); 
        System.out.println("");
        
        //Cartago
        System.out.println("1. Equipo: " + c.getNombre());
        System.out.println("2. MP: " + cs.getNumJornada()); 
        System.out.println("3. D: " + empatados2);   
        System.out.println("4. W: " + ganados2); 
        System.out.println("5. L: " + perdidos2); 
        System.out.println("6. GF: " + favor2);  
        System.out.println("7. GA: " + contra2); 
        System.out.println("8. GD: " + diferencia2);  
        System.out.println("9. Pts: " + cs.pts()); 
        System.out.println("");
        
        //Saprissa
        System.out.println("1. Equipo: " + s.getNombre());
        System.out.println("2. MP: " + sc.getNumJornada()); 
        System.out.println("3. D: " + empatados2);   
        System.out.println("4. W: " + ganados2); 
        System.out.println("5. L: " + perdidos2); 
        System.out.println("6. GF: " + favor2);  
        System.out.println("7. GA: " + contra2); 
        System.out.println("8. GD: " + diferencia2);  
        System.out.println("9. Pts: " + sc.pts()); 
    }//fin de main
}//fin de clase
