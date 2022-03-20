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
public class Mago extends Personaje{
    private int saludTotal;
    public Mago()
    {
       super("Mago",40,50,5,0.85,"");
        this.saludTotal=40;
        
    }
    
    public void mejorarAtaque(){
        if(this.getSalud()<=10){
            int ataque = this.getAtaque();
            ataque +=20;
            this.setAtaque(ataque);  
            System.out.println("Vocatis tenebris copias..");
            System.out.println("vingooo... mi hechizo a funcionado... mi ataque a mejoradooo....");
        }
    }

    public void mejorarVida(){
        Random r= new Random();
        
        int a = r.nextInt(100);
        
        if(a>60 && this.getSalud()<=15){
        int salud = this.getSalud();
        salud+=15;
        this.setSalud(salud);
        System.out.println("altiore sanitar");
        System.out.println("Mi hechizo funcionaa..... vez he recuperado fuerzas");
        }
    }
    

    
}
