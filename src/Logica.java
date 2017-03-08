import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import processing.core.PApplet;

public class Logica {
	
	private PApplet app;
	private String[] nombres, datos, colores;
	private ArrayList<Estudiante>estudia;
	private HashSet<Estudiante>estuSinRep;
	
	
	public Logica(PApplet app) {
		this.app=app;
		
		
		nombres= app.loadStrings("data/nombres.txt");
		datos= app.loadStrings("data/datos.txt");
		colores= app.loadStrings("data/colores.txt");
		
		estudia= new ArrayList<>();
		estuSinRep= new HashSet<>();
		
		for (int i = 0; i < nombres.length; i++) {
			String [] cadaNombre = nombres[i].split(":");
			String [] cadaDato = datos[i].split("/");
			String [] cadaColor = colores[i].split("/");
			
			System.out.println(cadaNombre[0]);
			
//		String [] cadaNombre1= new String[20];
//		String [] cadaNombre2= new String[10];
//			
//			for (int j = 0; j < cadaNombre.length; j++) {
//				
//				cadaNombre[j]= cadaNombre1[1];
//				System.out.println(cadaNombre1[1]);
			
			estudia.add(new Estudiante(app,Integer.parseInt(cadaColor[0]),Integer.parseInt(cadaColor[1]),Integer.parseInt(cadaColor[2]),cadaNombre[0],cadaNombre[1],cadaDato[0],cadaDato[1],cadaDato[2]));
			
//			}
		}
		
	}

	public void pintar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < estudia.size(); i++) {
			estudia.get(i).pintar(100, 50+30*i);
		}
	}
	
	public void keyP(){
		if(app.keyCode=='1'){
			Collections.sort(estudia);
				
			}
		}
	}


