package es.studium.ejerciciosBoletinPOO;

public class Raza {

	   private String nombreRaza;
	    
	    //M�todos constructores
	    public Raza() {
	        //Constructor vac�o
	    }
	    
	    public Raza(String nombreRaza) {
	        this.nombreRaza = nombreRaza;
	    }
	    
	    //M�todos inspectores (Getters)
	    public String getNombreRaza() {
	        return nombreRaza;
	    }
	    
	    //M�todos modificadores (Setters)
	    public void setNombreRaza(String nombreRaza) {
	        this.nombreRaza = nombreRaza;
	    }
}
