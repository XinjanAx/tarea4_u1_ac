package com.uce.tarea4.demo;

public class Materia {
	private String nombre;
	private byte semetre;
	private String aula;
	
	//------------get set------------------
	public String getNombre() {
		return nombre;
	}
	public byte getSemetre() {
		return semetre;
	}
	public String getAula() {
		return aula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSemetre(byte semetre) {
		this.semetre = semetre;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", semetre=" + semetre + ", aula=" + aula + "]";
	}
	
	
	
}
