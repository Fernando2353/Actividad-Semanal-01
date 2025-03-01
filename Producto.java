/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author lfari
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    
    public Producto(int codigo,String nombre, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }
    public String toString(){
        return "Codigo: " + codigo + " Nombre del Producto: " + nombre + " Precio: Q." + precio;
    }
    public void setPrecio(double precio){
    if (precio>0){
    this.precio=precio;
    }
    else{
     System.out.println("El precio tiene que ser mayor a 0");   
    }
    }
        
    public double getPrecio(){
    return precio;
    }
}

