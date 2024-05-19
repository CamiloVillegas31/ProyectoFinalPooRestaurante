
package com.mycompany.restaurante;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class VerificacionUsuarios {
    
    private ArrayList<Usuarios> listaUsuarios;

    public VerificacionUsuarios(ArrayList<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public boolean verificar (String userName, String userPass){
        for (Usuarios usuarios : listaUsuarios){
            if (usuarios.getUserName().equals(userName)){
                return usuarios.getUserPass().equals(userPass);
            }     
        }
        return false;
    }
}
