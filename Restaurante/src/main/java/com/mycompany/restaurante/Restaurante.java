/* Proyecto final Poo Ingeniería de sistemas nocturno    
 * Integrantes: Jose Luis Campo Zuñiga y Camilo Andrés Villegas Flor  
 */

package com.mycompany.restaurante;
import java.util.Scanner;

import java.util.ArrayList;

public class Restaurante {

    public static void main(String[] args) {
        
   /*     
    //Creamos una instancia de la clase Scanner
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Usuarios> listaUsuarios = Usuarios.obtenerUsuarios();
        
        VerificacionUsuarios autenticador = new VerificacionUsuarios(listaUsuarios);
        
        //solicitamos el nombre de usuario
        System.out.println("Ingrese el nombre de usuario: \n");
        String nameUser = teclado.nextLine(); //Guarda el nombre de usuario
        
        //solicitamos la contraseña 
        System.out.println("Ingrese la contraseña: \n");
        String passUser = teclado.nextLine(); //Guarda la contraseña de usuario
        
        boolean verificado = autenticador.verificar(nameUser, passUser);
        
        // Mostramos el resultado de la verificación
        if (verificado) {
            System.out.println("Autenticación exitosa. Bienvenido, " + nameUser + ".");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.\n Intente nuevamente.");
        }
 */
        jrfmLogin objLogin = new jrfmLogin();
        objLogin.setVisible(true);
   
    }

}
