package es.studium.ejerciciosBoletinPOO1;

import java.time.LocalDate;

public class Director {
	// Atributos privados
	private String nombre;
	private LocalDate fechaNacimiento;
	private String nacionalidad;

	// M�todos constructores
	public Director() {
		// Constructor por defecto o constructor vac�o
		nombre = "";
		fechaNacimiento = LocalDate.of(0, 0, 0);
		nacionalidad = "";
	}

	public Director(String nombre, LocalDate fechaNacimiento, String nacionalidad) {
		// Constructor por par�metros, con todos los par�metros
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
	}

	// M�todos inspectores (getters)
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	// M�todos modificadores (setters)
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}
