/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.modelo;

/**
 *
 * @author emerh
 */
public class Curso {
    private int idCurso;
    private String nombreDelCurso;
    boolean estadoActivo;

     
          public Curso(){}  

    public Curso(int idCurso, String nombreDelCurso, boolean estadoActivo) {
        this.idCurso = idCurso;
        this.nombreDelCurso = nombreDelCurso;
        this.estadoActivo = estadoActivo;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    
   
            
   
}
        



    