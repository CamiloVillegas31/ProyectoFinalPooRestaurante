
package com.mycompany.restaurante;


public class Producto {
    
    public String producto;
    public Double valor;
    
    //Constructor
    
    public Producto(String producto, Double valor) {
        this.producto = producto;
        this.valor = valor;
    }
    
    //Constructor Get and Set
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    //Método to String
    
     @Override
    public String toString() {
        return "Producto: " + producto + "\n Precio: " + valor;
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
}
