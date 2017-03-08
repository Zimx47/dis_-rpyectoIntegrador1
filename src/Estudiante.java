import java.util.ArrayList;

import processing.core.PApplet;

public class Estudiante implements Comparable<Estudiante> {
	  private PApplet app;

	  private String[] cadena;
	  private int r,g,b,peso, edad, sumaColores;
	  private String nombre1, nombre2, cedula;
	public Estudiante(PApplet app, int r, int g, int b, String nombre1, String nombre2, String cedula, int edad,
			int peso) {
		
		this.app = app;
		this.r = r;
		this.g = g;
		this.b = b;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		sumaColores=r+g+b;
	} 
	
	public void pintar(int x, int y){
		
		app.fill(r,g,b);
		app.text(nombre1, x, y);
		app.text(nombre2, x+60, y);
		app.text(cedula, x+130, y);
		app.text(edad, x+220, y);
		app.text(peso, x+260, y);
		app.text("Suma de colores: "+ sumaColores, x+300, y);
	}

	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return this.nombre2.compareTo(o.getNombre2());
	}

	public String[] getCadena() {
		return cadena;
	}

	public void setCadena(String[] cadena) {
		this.cadena = cadena;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	


	@Override
	public int hashCode() {
		
		return this.sumaColores;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Estudiante){
			Estudiante estu = (Estudiante) obj;
		return this.sumaColores == estu.getSumaColores();
		}
		return false;
	}

	public int getSumaColores() {
		return sumaColores;
	}

	public void setSumaColores(int sumaColores) {
		this.sumaColores = sumaColores;
	}

//	@Override
//	public int hashCode() {
//		return this.edad;
//	}
	
	

//	@Override
//	public boolean equals(Object obj) {
//	
//		if(obj instanceof Estudiante){
//			Estudiante estu = (Estudiante) obj;
//		return this.edad == estu.edad;
//		}
//		return false;
//	}


	
	  
	  

}
