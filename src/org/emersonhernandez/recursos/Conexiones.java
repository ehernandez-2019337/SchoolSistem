/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.recursos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author emerh
 */
public class Conexiones {
    private Connection conexion;
    private static Conexiones instancia;
    public Conexiones(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_colegio?useSSL=false", "root", "admin");
        }catch(Exception error ){
          error.printStackTrace();          
        }
    }
    
public synchronized static Conexiones getInstancia(){
    if(instancia==null)
        instancia = new Conexiones();
    return instancia;
}
public Connection getConexiones(){
    return conexion;
}
public void setConexiones(Connection conexion){
    this.conexion= conexion;
}
    
}
