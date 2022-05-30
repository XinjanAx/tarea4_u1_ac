package com.uce.tarea4.demo;

import java.time.LocalDate;

public class Estudiante {
	private String nombre, apellido;
	LocalDate fechaN;
	
	//------------get set------------------
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public LocalDate getFechaN() {
		return fechaN;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setFechaN(LocalDate fechaN) {
		this.fechaN = fechaN;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", fechaN=" + fechaN + "]";
	}
	
	
	
	
}
