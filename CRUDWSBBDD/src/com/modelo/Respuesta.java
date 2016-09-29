package com.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Respuesta")
public class Respuesta {
	private int codigo;
	private String descripcion;
	
	public Respuesta(){
		
	}
	
	public Respuesta(int codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Respuesta [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}

}
