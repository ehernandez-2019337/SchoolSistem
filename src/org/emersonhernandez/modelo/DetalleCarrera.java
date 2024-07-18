/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.modelo;
public class DetalleCarrera {
	//fase de declaración de variables
	private int idDetalleCarrera;
	private int carrera;
	private int  cursos;
	private int  grado;
        boolean estadoActivo;
        
    public DetalleCarrera() {}

    public int getIdDetalleCarrera() {
        return idDetalleCarrera;
    }

    public void setIdDetalleCarrera(int idDetalleCarrera) {
        this.idDetalleCarrera = idDetalleCarrera;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public int getCursos() {
        return cursos;
    }

    public void setCursos(int cursos) {
        this.cursos = cursos;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public DetalleCarrera(int idDetalleCarrera, int carrera, int cursos, int grado, boolean estadoActivo) {
        this.idDetalleCarrera = idDetalleCarrera;
        this.carrera = carrera;
        this.cursos = cursos;
        this.grado = grado;
        this.estadoActivo = estadoActivo;
    }

	
	
	
	}