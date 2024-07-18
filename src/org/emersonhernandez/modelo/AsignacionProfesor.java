/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.modelo;
public class AsignacionProfesor {
	//fase de declaración de variables
	private int idAsignacionAlumnos;
	private int idDetalleCarrera;
	private int  idProfesor;
	private int  jornada;
        private int seccion;
        boolean estadoActivo;
        

        public AsignacionProfesor() {}
        
        public AsignacionProfesor(int idAsignacionAlumnos, int idDetalleCarrera, int idProfesor, int jornada, int seccion, boolean estadoActivo) {
        this.idAsignacionAlumnos = idAsignacionAlumnos;
        this.idDetalleCarrera = idDetalleCarrera;
        this.idProfesor = idProfesor;
        this.jornada = jornada;
        this.seccion = seccion;
        this.estadoActivo = estadoActivo;
    }
        


    public int getIdAsignacionAlumnos() {
        return idAsignacionAlumnos;
    }

    public void setIdAsignacionAlumnos(int idAsignacionAlumnos) {
        this.idAsignacionAlumnos = idAsignacionAlumnos;
    }

    public int getIdDetalleCarrera() {
        return idDetalleCarrera;
    }

    public void setIdDetalleCarrera(int idDetalleCarrera) {
        this.idDetalleCarrera = idDetalleCarrera;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

  
   

    

	
	
	
	}