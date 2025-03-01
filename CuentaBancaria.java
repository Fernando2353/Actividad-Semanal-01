/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author lfari
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("Fernando","00001",25000);
        Cliente cliente2 = new Cliente("Julio","00002",40000);
        
        System.out.println(cliente1);
        cliente1.setAbono(25000);
        cliente1.depositar();
        cliente1.setRetiro(1025);
        cliente1.retirar();
        cliente1.setRetiro(48975);
        cliente1.retirar();
        cliente1.mostrarSaldo();
        
        System.out.println(cliente2);
        cliente2.setAbono(20000);
        cliente2.depositar();
        cliente2.setRetiro(1000);
        cliente2.retirar();
        cliente2.mostrarSaldo();
    }
    
}
