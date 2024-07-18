/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.modelo;
public class Alumno {
	//fase de declaración de variables
	private int idAlumno;
	private String nombreDelAlumno;
	private String apellidoDelAlumno;
	private String carnetAlumno;
	private int departamento;
        private int municipio;
        private int telefono;
        private String correo;
        boolean estadoActivo;
        
    public Alumno() {}
    public Alumno(int idAlumno, String nombreDelAlumno, String apellidoDelAlumno, String carnetAlumno, int departamento, int municipio, int telefono, String correo, boolean estadoActivo) {
        this.idAlumno = idAlumno;
        this.nombreDelAlumno = nombreDelAlumno;
        this.apellidoDelAlumno = apellidoDelAlumno;
        this.carnetAlumno = carnetAlumno;
        this.departamento = departamento;
        this.municipio = municipio;
        this.telefono = telefono;
        this.correo = correo;
        this.estadoActivo = estadoActivo;
    }
        
	
	//fase de declaración y definición de los métodos

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreDelAlumno() {
        return nombreDelAlumno;
    }

    public void setNombreDelAlumno(String nombreDelAlumno) {
        this.nombreDelAlumno = nombreDelAlumno;
    }

    public String getApellidoDelAlumno() {
        return apellidoDelAlumno;
    }

    public void setApellidoDelAlumno(String apellidoDelAlumno) {
        this.apellidoDelAlumno = apellidoDelAlumno;
    }

    public String getCarnetAlumno() {
        return carnetAlumno;
    }

    public void setCarnetAlumno(String carnetAlumno) {
        this.carnetAlumno = carnetAlumno;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getMunicipio() {
        return municipio;
    }

    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean EstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estado_activo) {
        this.estadoActivo = estadoActivo;
    }
	
	
	
	}