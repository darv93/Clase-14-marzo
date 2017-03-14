/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Factura {
    
    private int id;
    private ArrayList<Producto> b;
    
    public Factura(int c){
        this.b = new ArrayList<>();
    }
    
    public void adicionar(Producto p){
        this.b.add(p);
    }
    
    public double calcularTotal(){
        double total = 0;
//        for ( int i=0;i< this.b.size();i++){
//            Producto p = this.b.get(i);
//            total+=p.getPrecio();
//        }
        for (Producto p: b){
            total+=p.getPrecio();
        }
        return total;
    }
    
    
    public Producto buscar(String nombre){
        for(Producto b: b){
            if(b.getNombre().equals(nombre))
                return b;
        }
        return null;
    }
    
}
