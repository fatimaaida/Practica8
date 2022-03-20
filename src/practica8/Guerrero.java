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
public class Guerrero extends Personaje{
    
    public Guerrero(){
    super("Guerrero",100,20,15,0.7,"Golpe Super Divine");
    }
    
    public void subirAtaque(){
    
    Random r= new Random();
    int a= r.nextInt(1000);
    if(a>10 && this.getSalud()<=120){
        int defensa = super.getDefensa();
        defensa-=2;
        super.setDefensa(defensa);
        System.out.println("Rufian, me hicisteis dañar mi armadura..... Pagareis por ello");
        }
    }
    
}
