/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.controlador;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import org.emersonhernandez.modelo.Curso;
import org.emersonhernandez.modelo.Telefono;
import org.emersonhernandez.recursos.Conexiones;

/**
 *
 * @author emerh
 */
public class ControlDelCurso {
    public void agregarCurso(Curso alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_ingresarCurso(?,?);");
                       
            sentencia.setString(1, alumno.getNombreDelCurso());
            sentencia.setBoolean(2, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha enviado un Curso a la BD" );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void actualizar_Curso(Curso alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_actualizar_curso(?,?,?);");
            sentencia.setInt(1, alumno.getIdCurso());        
            sentencia.setString(2, alumno.getNombreDelCurso());
            sentencia.setBoolean(3, true);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Actualizado un curso en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
     public void Eliminar_Curso(Curso alumno){
        try{
            PreparedStatement sentencia = Conexiones.getInstancia().getConexiones().prepareCall("call sp_eliminar_curso(?,?);");
            sentencia.setInt(1, alumno.getIdCurso());       
            sentencia.setBoolean(2, false);
           
            sentencia.execute();
            JOptionPane.showMessageDialog(null,"Ha Eliminado un Curso en la BD " );
        }catch(Exception error){
            error.printStackTrace();
        }
        
    }
}
