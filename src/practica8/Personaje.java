/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author Usuario
 */
public class Personaje {
    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;
    private double ta=0.8;
    private String tipoAtaque="golpe";
    
    public Personaje(){
        //_nombre
        this.setNombre("Computadora");
        this.setSalud(100);
        this.setAtaque(24);
        this.setDefensa(30);
    }
    
    public Personaje(String _nombre, int _salud, int _ataque, int _defensa, double _ta, String _tipoAtaque){
        
        this.nombre=_nombre;
        this.salud=_salud;
        this.ataque=_ataque;
        this.defensa=_defensa;
        this.ta=_ta;
        this.tipoAtaque=_tipoAtaque;
    }

    public void setNombre(String _nombre) {
        this.nombre=_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setSalud(int _salud) {
        this.salud=_salud;
    }
    public int getSalud(){
        return this.salud;
    }
    public void setAtaque(int _ataque) {
        this.ataque=_ataque;
    }
    public int getAtaque(){
        return this.ataque;
    }
    public void setDefensa(int _defensa) {
        this.defensa=_defensa;
    }
    public int getDefensa(){
        return this.defensa;
    }
    public void setTa(double _ta) {
        this.ta=_ta;
    }
    public double getTa(){
        return this.ta;
    }
    
    public void atacado(int _ataque){
        int vidaRestante=this.getSalud();
        int danho=_ataque-this.getDefensa();
            if(danho>0){
                vidaRestante=danho;
                System.out.println(this.getNombre()+"Ha recibido un "+tipoAtaque+"..... Ha perdido "+danho+"vida");
             }else{
                 System.out.println(this.getNombre()+"Se ha librado de un "+ tipoAtaque+".... Preprarandose para otro ataque..");
            }
        this.setSalud(vidaRestante);
        System.out.println("La vida de "+this.getNombre()+ "es de "+this.salud);
    }
    
    public void evitar(){
        System.out.println(this.getNombre()+ "evito el "+tipoAtaque+" con exito!");
    }
    public boolean vive(){
    boolean flag =true;
    if(this.getSalud()<+0) flag=false;
    
    return flag;
    }
    
}
