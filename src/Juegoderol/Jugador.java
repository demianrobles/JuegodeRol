
package Juegoderol;

import java.util.Random;


public class Jugador {
    public String nombre;
    public String clase;
    public String nivel;
    public int vida;
    public int minPower;
    public int maxPower;
    private final Random random = new Random();
    
    public Jugador (String nombre, String clase, String nivel, int vida, int minpower, int maxpower){
    
        this.nombre = nombre;
        this.clase = clase;
        this.nivel= nivel;
        this.vida = vida;
        this.minPower = minpower;
        this.maxPower = maxpower;
    
    }
    
    public void atacar(Jugador otroJugador)
    {
      //JUGADOR 1 ATAQUE
       int powerAtaque = minPower + random.nextInt(maxPower - minPower);
         System.out.println(this.nombre+" " +this.clase+" ataca con "+powerAtaque+" de energia");
       otroJugador.defender(powerAtaque);
    }
    
    public void defender(int poderAtaque)
    {
        //TODO agregar random
        int valorAtaquePostDefensa=poderAtaque;
        if (valorAtaquePostDefensa>0){
            this.vida-=valorAtaquePostDefensa;
        }
        
        if (estaVivo())
        {
          System.out.println(this.nombre+" " +this.clase+" ha quedado con el "+this.vida+" porciento de su vida");
        }else{
             System.out.println(this.nombre+" ha muerto");
        }
    }
    
    public boolean estaVivo()
    {
        return this.vida>0;
    }
    
}
