/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Caballero extends Personaje{
    
    public Caballero()
    {
        super("Caballero",150,20,25,0.75,"Golpe Divino");
    }
        public void bajarDefensa(){

            Random r= new Random();
            int a= r.nextInt(1000);
            if(a>70 && this.getSalud()<=15){
                int ataque = super.getAtaque();
                ataque+=2;
                super.setAtaque(ataque);
                System.out.println("Pobre Iluso... Tus golpes solo aumentan mi fuerza");
            }
        }
}
