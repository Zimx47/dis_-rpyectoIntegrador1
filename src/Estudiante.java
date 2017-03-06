import java.util.ArrayList;

import processing.core.PApplet;

public class Estudiante {
	  private PApplet app;
//	  private ArrayList<Letra> letras;
	  private String[] cadena;
	  private int r,g,b;
	  private String nombre1, nombre2, cedula, edad, peso;
	public Estudiante(PApplet app, int r, int g, int b, String nombre1, String nombre2, String cedula, String edad,
			String peso) {
		
		this.app = app;
		this.r = r;
		this.g = g;
		this.b = b;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
	} 
	  
	  

}
