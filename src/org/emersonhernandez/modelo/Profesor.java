/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.modelo;

/**
 *
 * @author emerh
 */
public class Profesor {
	//fase de declaración de variables
	private int idProfesor;
	private String nombreDelProfesor;
        private String apellidoDelProfesor;
	private String carnetProfesor;
	private int departamento;
        private int municipio;
        private int telefono;
        private String correo;
        boolean estadoActivo;


    public Profesor(int idProfesor, String nombreDelProfesor, String apellidoDelProfesor, String carnetProfesor, int departamento, int municipio, int telefono, String correo, boolean estadoActivo) {
        this.idProfesor = idProfesor;
        this.nombreDelProfesor = nombreDelProfesor;
        this.apellidoDelProfesor = apellidoDelProfesor;
        this.carnetProfesor = carnetProfesor;
        this.departamento = departamento;
        this.municipio = municipio;
        this.telefono = telefono;
        this.correo = correo;
        this.estadoActivo = estadoActivo;
    }

    public Profesor() {
    }
        
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreDelProfesor() {
        return nombreDelProfesor;
    }

    public void setNombreDelProfesor(String nombreDelProfesor) {
        this.nombreDelProfesor = nombreDelProfesor;
    }

    public String getApellidoDelProfesor() {
        return apellidoDelProfesor;
    }

    public void setApellidoDelProfesor(String apellidoDelProfesor) {
        this.apellidoDelProfesor = apellidoDelProfesor;
    }

    public String getCarnetProfesor() {
        return carnetProfesor;
    }

    public void setCarnetProfesor(String carnetProfesor) {
        this.carnetProfesor = carnetProfesor;
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

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
	
        
            
}