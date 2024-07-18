/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.emersonhernandez.modelo.Carrera;
import org.emersonhernandez.modelo.Curso;
import org.emersonhernandez.modelo.Telefono;
import org.emersonhernandez.recursos.Conexiones;

/**
 *
 * @author emerh
 */
public class ControlDelCarrera {
    public void agregarCarrera(Carrera alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_agregarCarrera(?,?);");
                       
            sentencia.setString(1, alumno.getNombreDeCarrera());
            sentencia.setBoolean(2, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha enviado una carrera a la BD" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void actualizar_Carrera (Carrera alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_actualizar_carrera(?,?,?);");
            sentencia.setInt(1, alumno.getIdCarrera());        
            sentencia.setString(2, alumno.getNombreDeCarrera());
            sentencia.setBoolean(3, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado una carrera en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void Eliminar_Carrera(Carrera alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_eliminar_carrera(?,?);");
            sentencia.setInt(1, alumno.getIdCarrera());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado una Carrera en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
