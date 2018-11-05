package Juegoderol;
import java.util.Random;
import java.util.Scanner;



public class Principal {

    public static void main (String [] args) throws InterruptedException {

        Scanner scanner  = new Scanner (System.in);

        Jugador jugador1 = new Jugador("Rick","Mago","34",100,5,15); 
        Jugador jugador2 = new Jugador("Morfeo","Guerrero","40",100, 2, 18);

        ejecutarPartida(jugador1, jugador2);     
                        
                                    
    }
    
    private static void ejecutarPartida(Jugador jugadorConTurno,Jugador jugadorSinTurno) throws InterruptedException{
        System.out.println("***** JUEGO DE ROL *****");
        while(jugadorConTurno.estaVivo() && jugadorSinTurno.estaVivo()){
             jugadorConTurno.atacar(jugadorSinTurno);
             Jugador aux=jugadorConTurno;
             jugadorConTurno=jugadorSinTurno;
             jugadorSinTurno=aux;
             Thread.sleep(1000);
        }
        if (jugadorConTurno.estaVivo()){
             System.out.println(jugadorConTurno.nombre+ " ha ganado!");
        }else{
            System.out.println(jugadorSinTurno.nombre+ " ha ganado!");
        }
    }
}
            
    
    
    
    
   
   
