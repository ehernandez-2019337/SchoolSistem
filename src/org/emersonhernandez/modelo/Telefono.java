/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.emersonhernandez.modelo;

/**
 *
 * @author emerh
 */
public class Telefono {
    private int idTelefono;
	private String telefono1;
        private String telefono2;
        boolean estadoActivo;

    public Telefono(int idTelefono, String telefono1, String telefono2, boolean estadoActivo) {
        this.idTelefono = idTelefono;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.estadoActivo = estadoActivo;
    }

    public Telefono(){
    }
            
            
    public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
}
        



    