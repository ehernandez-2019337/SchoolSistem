/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.emersonhernandez.modelo.Alumno;
import org.emersonhernandez.recursos.Conexiones;

/**
 *
 * @author emerh
 */
public class ControlDelAlumno {
    public void agregarAlumno(Alumno alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_agregarAlumno(?,?,?,?,?,?,?,?);");
            sentencia.setString(1, alumno.getNombreDelAlumno());
            sentencia.setString(2, alumno.getApellidoDelAlumno());
            sentencia.setString(3, alumno.getCarnetAlumno());
            sentencia.setString(4, alumno.getCorreo());
            sentencia.setInt(5,alumno.getTelefono());            
            sentencia.setInt(6,alumno.getDepartamento());
            sentencia.setInt(7,alumno.getMunicipio());
            sentencia.setBoolean(8, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha enviado un Alumno a la BD" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void actualizar_Alumno(Alumno alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_actualizar_alumno(?,?,?,?,?,?,?,?,?);");
            sentencia.setInt(1, alumno.getIdAlumno());        
            sentencia.setString(2, alumno.getNombreDelAlumno());
            sentencia.setString(3, alumno.getApellidoDelAlumno());
            sentencia.setString(4, alumno.getCarnetAlumno());
            sentencia.setString(5, alumno.getCorreo());
            sentencia.setInt(6,alumno.getTelefono());            
            sentencia.setInt(7,alumno.getDepartamento());
            sentencia.setInt(8,alumno.getMunicipio());
            sentencia.setBoolean(9, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado un alumno en la Base de " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void Eliminar_Alumno(Alumno alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_eliminar_alumno(?,?);");
            sentencia.setInt(1, alumno.getIdAlumno());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado un alumno en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
