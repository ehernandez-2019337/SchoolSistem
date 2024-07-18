/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.emersonhernandez.modelo.Alumno;
import org.emersonhernandez.modelo.AsignacionAlumno;
import org.emersonhernandez.modelo.DetalleCarrera;
import org.emersonhernandez.recursos.Conexiones;

/**
 *
 * @author emerh
 */
public class ControlDeAsignacion {
    public void agregarAsignacionAlum(AsignacionAlumno alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_agregarAsignacionAlumno(?,?,?,?,?);");
            sentencia.setInt(1, alumno.getIdDetalleCarrera());
            sentencia.setInt(2, alumno.getIdAlumno());
            sentencia.setInt(3, alumno.getJornada());
            sentencia.setInt(4, alumno.getSeccion());
            sentencia.setBoolean(5, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha asignado un alumno a la BD" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void actualizar_AsigAlum(AsignacionAlumno alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_actualizar_asignacion_alumno(?,?,?,?,?,?);");
            sentencia.setInt(1, alumno.getIdAsignacionAlumnos());        
            sentencia.setInt(2, alumno.getIdDetalleCarrera());
            sentencia.setInt(3, alumno.getIdAlumno());
            sentencia.setInt(4, alumno.getJornada());
            sentencia.setInt(5, alumno.getSeccion());
            sentencia.setBoolean(6, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado uba asignacion en la Base de " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void Eliminar_AsigAlum(AsignacionAlumno alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_eliminar_asignacionAlumno(?,?);");
            sentencia.setInt(1, alumno.getIdAsignacionAlumnos());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado una asignacion en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
