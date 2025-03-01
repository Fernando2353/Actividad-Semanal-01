/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

/**
 *
 * @author lfari
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1 = new Producto(1,"Cocacola",7.50);
        System.out.println(producto1);
        
        producto1.setPrecio(-2.0);
        System.out.println(producto1);
       
    }
    
}
