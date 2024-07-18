/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.emersonhernandez.modelo.Telefono;
import org.emersonhernandez.recursos.Conexiones;

/**
 *
 * @author emerh
 */
public class ControlDelTelefono {
    public void agregarTelefono(Telefono alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_ingresarTelefono(?,?,?);");
                       
            sentencia.setString(1, alumno.getTelefono1());
            sentencia.setString(2, alumno.getTelefono2());
            sentencia.setBoolean(3, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha enviado un Telefono a la BD" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void actualizar_Telefono(Telefono alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_actualizar_telefono(?,?,?,?);");
            sentencia.setInt(1, alumno.getIdTelefono());        
            sentencia.setString(2, alumno.getTelefono1());
            sentencia.setString(3, alumno.getTelefono2());
            sentencia.setBoolean(4, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado un Telefono en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void Eliminar_Telefono(Telefono alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_eliminar_telefono(?,?);");
            sentencia.setInt(1, alumno.getIdTelefono());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado un Telefono en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
