/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.modelo;
public class AsignacionAlumno {
	//fase de declaración de variables
	private int idAsignacionAlumnos;
	private int idDetalleCarrera;
	private int  idAlumno;
	private int  jornada;
        private int seccion;
        boolean estadoActivo;
        
    public AsignacionAlumno() {}

    public AsignacionAlumno(int idAsignacionAlumnos, int idDetalleCarrera, int idAlumno, int jornada, int seccion, boolean estadoActivo) {
        this.idAsignacionAlumnos = idAsignacionAlumnos;
        this.idDetalleCarrera = idDetalleCarrera;
        this.idAlumno = idAlumno;
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

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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