package com.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Usuario")
public class Usuario {
    private String name;
    private String apel;
    private long id; // Será un id autonumerico en BBDD
 
    public Usuario() {
    }
    
    public Usuario(String nombre, String apel){
    	this.name = nombre;
    	this.apel = apel;
    }
    
    public Usuario(long id, String nombre, String apel){
    	this.id = id;
    	this.name = nombre;
    	this.apel = apel;
    }
 
    public void setName(String n) {
        name = n;
    }
 
    public String getName() {
        return name;
    }
 
    public void setId(long i) {
        id = i;
    }
    
    public long getId() {
        return id;
    }
    
    public void setApel(String apellidos) {
        apel = apellidos;
    }
 
    public String getApel() {
        return apel;
    }
}
