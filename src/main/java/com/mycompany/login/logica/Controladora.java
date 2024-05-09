/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Marisa
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public String validadUsuario(String usuario, String contrasenia) {
        
        String mensaje="";
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuario usu : listaUsuarios){
            if (usu.getNombreUsuario().equals(usuario)){
                if(usu.getContraseña().equals(contrasenia)){
                    mensaje = "Usuario y contraseña correctos. Bienvenido/a!";
                } else {
                    mensaje = "Contraseña incorrecta";
                }
            }else {
                mensaje = "Usuario no encontrado";
            }
        }
        
        return mensaje;
    }
    
}
