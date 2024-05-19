
package com.mycompany.restaurante;

import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
    
   // public String producto;
    //public Double valor;
    
    
    // ArrayList para guardar los productos
    ArrayList<Producto> platosFuertes  = new ArrayList<>();
    ArrayList<Producto> bebidas  = new ArrayList<>();
    ArrayList<Producto> entradas  = new ArrayList<>();
    // Creamos una instancia de Carta
        
    Producto productoPlatosFuertes = new Producto ("Costilla BBQ",36000.00);
       
    public void MostrarCarta(){
        System.out.println(platosFuertes.get(0));
    }
    
}