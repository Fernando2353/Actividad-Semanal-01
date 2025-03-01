/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package termometro;

/**
 *
 * @author lfari
 */
public class Temperatura {
    private double grados;
    
    public Temperatura(double grados){
        this.grados=grados;
    }
    public String toString(){
    return "Temperatura :" + grados + " Grados Celsius";
    }
    public void setGrados(double grados){
        this.grados=grados;
    }
    public double getGrados(){
        return grados;
    }
    public void farhenheit(){
        grados=(grados*9/5)+32;
        System.out.println(grados + " Grados Farhenheit");
    }
    public void kelvin(){
        grados=grados+ 273.15;
        System.out.println(grados + " Grados Kelvin");
    }
}
