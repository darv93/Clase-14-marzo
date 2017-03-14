/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;
/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args){
        
        Producto p1 = new Producto();
        p1.setNombre("A");
        p1.setPrecio(10);
        
        Producto p2 = new Producto();
        p1.setNombre("B");
        p1.setPrecio(20);
        
        Producto p3 = new Producto();
        p1.setNombre("C");
        p1.setPrecio(30);
        
        Factura f = new Factura(1);
        f.adicionar(p3);
        f.adicionar(p1);
        f.adicionar(p2);
        double total = f.calcularTotal();
        System.out.println("total" + total);
        
        Producto b = f.buscar("A");
        if (b!=null)
            System.out.println("precio" + b.getPrecio());
        
    }
    
}
