
package com.mycompany.restaurante;

import java.util.ArrayList;
import java.util.Arrays;

public class Carta {
    
    // ArrayList para guardar los productos
    ArrayList<Producto> platosFuertes  = new ArrayList<>();
    ArrayList<Producto> bebidas  = new ArrayList<>();
    ArrayList<Producto> entradas  = new ArrayList<>();
    
    public static void main(String[] args) {
        // Creamos una instancia de Carta
        Carta carta = new Carta();
        
        // Agregamos productos a las listas
        carta.platosFuertes.add(new Producto("Caldo", 12.0));
        carta.bebidas.add(new Producto("Limonada", 15.8));
        
        // Mostramos los productos agregados
        carta.mostrarProductos("Platos Fuertes", carta.platosFuertes);
        carta.mostrarProductos("Bebidas", carta.bebidas);
    }
    
    // Método para mostrar los productos
    public void mostrarProductos(String tipo, ArrayList<Producto> productos) {
        System.out.println(tipo + ":");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
        }
    }

  
}