package com.uce.tarea4.demo;

public class Matricula {
	Materia mtr = new Materia();
	Estudiante est = new Estudiante();
	
	public Matricula(Materia mtr, Estudiante est) {
		super();
		this.mtr = mtr;
		this.est = est;
	}

	@Override
	public String toString() {
		return "Matricula [matricula=" + mtr + ", estudiante=" + est + "]";
	}
	
	
	
}
