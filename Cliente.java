/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author lfari
 */
public class Cliente {
    private String nombre;
    private String cuenta;
    private int retiro;
    private int abono;
    private int saldo;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getRetiro() {
        return retiro;
    }

    public void setRetiro(int retiro) {
        this.retiro = retiro;
    }

    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }
    
    public Cliente(String nombre,String cuenta,int saldo){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
   
    }
    public String toString(){
        return "Nombre: " + this.nombre + " No.Cuenta: " + this.cuenta + " Saldo Inicial: " + this.saldo;
    }
    public void depositar(){
      saldo=saldo+abono;  
      System.out.println("Saldo Actual: " + saldo);
    }
    public void retirar(){
      saldo=saldo-retiro;
      System.out.println("Saldo Actual: " + saldo);
    }
    public void mostrarSaldo(){
        System.out.println(saldo);
}
}
