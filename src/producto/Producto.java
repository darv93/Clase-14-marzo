/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author Estudiante
 */
public class Producto {

    private String nombre;
    private double precio;

    
    
    public void setNombre (String a){
        this.nombre=a;
    }
    
    public String getNombre (){
        return this.nombre;
    }
    
    public void setPrecio (double a){
        this.precio=a;
    }
    
    public double getPrecio (){
        return this.precio;
    }
    
    
    
    
    
}
