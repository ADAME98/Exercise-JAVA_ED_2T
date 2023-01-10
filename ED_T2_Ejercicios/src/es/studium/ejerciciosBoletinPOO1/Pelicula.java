package es.studium.ejerciciosBoletinPOO1;

public class Pelicula {
	// Atributos privados
	private String titulo;
	private int anio;
	private float duracion;
	private Director director;

	// M�todos constructores
	public Pelicula() {
		titulo = "";
		anio = 0;
		duracion= 0.0f;
		director = new Director();
	}

	public Pelicula(String titulo, int anio, float duracion, Director director) {
		// Constructor por par�metros, con todos los par�metros.
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
		this.director = director;
	}

	// M�todos inspectores (getters)
	public String getTitulo() {
		return titulo;
	}

	public int getAnio() {
		return anio;
	}

	public float getDuracion() {
		return duracion;
	}

	public Director getDirector() {
		return director;
	}

	// M�todos modificadores (setters)
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
}
