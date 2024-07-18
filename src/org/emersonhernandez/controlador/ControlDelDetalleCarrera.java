/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.emersonhernandez.modelo.Alumno;
import org.emersonhernandez.modelo.DetalleCarrera;
import org.emersonhernandez.recursos.Conexiones;

/**
 *
 * @author emerh
 */
public class ControlDelDetalleCarrera {
    public void agregarDetalle(DetalleCarrera alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_agregarDetalleCarrera(?,?,?,?);");
            sentencia.setInt(1, alumno.getCarrera());
            sentencia.setInt(2, alumno.getCursos());
            sentencia.setInt(3, alumno.getGrado());
            sentencia.setBoolean(4, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha enviado un Detalle a la BD" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void actualizar_Detalle(DetalleCarrera alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_actualizar_detalle_carrera(?,?,?,?,?);");
            sentencia.setInt(1, alumno.getIdDetalleCarrera());        
            sentencia.setInt(2, alumno.getCarrera());
            sentencia.setInt(3, alumno.getCursos());
            sentencia.setInt(4, alumno.getGrado());
            sentencia.setBoolean(5, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado un Detalle en la Base de " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void Eliminar_Detalle(DetalleCarrera alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_eliminar_detalleCarrera(?,?);");
            sentencia.setInt(1, alumno.getIdDetalleCarrera());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado un detalle en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
