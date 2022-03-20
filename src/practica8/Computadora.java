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
public class Computadora extends Personaje{
    private int saludTotal;
    
    //constructor
    public Computadora(String nombre, int salud, int ataque, int defensa){
        super();
        this.saludTotal=this.getSalud();
    }
    
    public void danhoCritico(){
        System.out.println("Mis circuitos no pueden soportar mas... Pero nunca me redire.... ");
    }
    
    @Override
    public void atacado(int _ataque){
        int vidaRestante=this.getSalud();
        int danho=_ataque-this.getDefensa();
            if(danho>0){
                vidaRestante=danho;
                if(((double)this.getSalud()/(double)this.saludTotal)<=0.2) danhoCritico();
                System.out.println(this.getNombre()+"Ha recibido un golpe..... Ha perdido "+danho+"vida");
             }else{
                 System.out.println(this.getNombre()+"Se ha librado de un golpe.... Preprarandose para otro ataque..");
            }
        this.setSalud(vidaRestante);
        System.out.println("La vida de "+this.getNombre()+ "es de "+this.getSalud());
    }

    
    public void recuperarFuerza(){
        Random r= new Random();
        //int flag= 0; // no recupero vida 
        
        int a= r.nextInt(1000);
        if(((double)this.getSalud()/(double)this.saludTotal)<=0.5 && a<25) {
            int salud =this.getSalud();
            salud +=10;
            this.setSalud(salud);
            System.out.println("JSJSJS...... Eres muy debil");
            System.out.println("JAJAJAJAJA..... En tu cara.. Logre curarme!");
        }
        //else{
        
        
        //}
    }
    
}
