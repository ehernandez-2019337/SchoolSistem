/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.modelo;

/**
 *
 * @author emerh
 */
public class Carrera {
    
    private int idCarrera;
    private String nombreDeCarrera;
    boolean estadoActivo;
    public Carrera(){} 

    public Carrera(int idCarrera, String nombreDeCarrera, boolean estadoActivo) {
        this.idCarrera = idCarrera;
        this.nombreDeCarrera = nombreDeCarrera;
        this.estadoActivo = estadoActivo;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreDeCarrera() {
        return nombreDeCarrera;
    }

    public void setNombreDeCarrera(String nombreDeCarrera) {
        this.nombreDeCarrera = nombreDeCarrera;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
     

    
}
