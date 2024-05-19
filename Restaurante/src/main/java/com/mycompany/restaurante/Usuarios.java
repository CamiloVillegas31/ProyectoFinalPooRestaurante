
package com.mycompany.restaurante;

import java.util.ArrayList;

public class Usuarios {
    
    private String userName;
    private String userPass;

    //Constructor
    
    public Usuarios(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }
    
    //Get and Set
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    
    //Metodo para los usuarios
    
    public static ArrayList<Usuarios> obtenerUsuarios(){
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuarios("Usuario1", "1234"));
        listaUsuarios.add(new Usuarios("Usuario2", "0000"));
        listaUsuarios.add(new Usuarios("Usuario3", "4321"));
        return listaUsuarios;        
    }
            
}
