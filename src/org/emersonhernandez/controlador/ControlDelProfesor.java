/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.emersonhernandez.modelo.Profesor;
import org.emersonhernandez.recursos.Conexiones;

/**
 *
 * @author emerh
 */
public class ControlDelProfesor {
    public void agreparProfesor(Profesor alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_agregarProfesor(?,?,?,?,?,?,?,?)");
            sentencia.setString(1, alumno.getNombreDelProfesor());
            sentencia.setString(2, alumno.getApellidoDelProfesor());
            sentencia.setString(3, alumno.getCarnetProfesor());
            sentencia.setString(4, alumno.getCorreo());
            sentencia.setInt(5,alumno.getTelefono());            
            sentencia.setInt(6,alumno.getDepartamento());
            sentencia.setInt(7,alumno.getMunicipio());
            sentencia.setBoolean(8, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha enviado un Profesor a la BD" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void actualizar_Profesor(Profesor alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_actualizar_profesor(?,?,?,?,?,?,?,?,?);");
            sentencia.setInt(1, alumno.getIdProfesor());        
            sentencia.setString(2, alumno.getNombreDelProfesor());
            sentencia.setString(3, alumno.getApellidoDelProfesor());
            sentencia.setString(4, alumno.getCarnetProfesor());
            sentencia.setString(5, alumno.getCorreo());
            sentencia.setInt(6,alumno.getTelefono());            
            sentencia.setInt(7,alumno.getDepartamento());
            sentencia.setInt(8,alumno.getMunicipio());
            sentencia.setBoolean(9, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado un profesor en la Base de " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void Eliminar_Profesor(Profesor alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_eliminar_profesor(?,?);");
            sentencia.setInt(1, alumno.getIdProfesor());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado un alumno en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
