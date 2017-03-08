import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import processing.core.PApplet;

public class Logica {
	
	private PApplet app;
	private String[] nombres, datos, colores;
	private ArrayList<Estudiante>estudia;
	private ArrayList<Estudiante>estudBackup;
	private HashSet<Estudiante>estuSinRep;
	
	
	public Logica(PApplet app) {
		this.app=app;
		
		
		nombres= app.loadStrings("data/nombres.txt");
		datos= app.loadStrings("data/datos.txt");
		colores= app.loadStrings("data/colores.txt");
		
		estudia= new ArrayList<>();
		estuSinRep= new HashSet<>();
		estudBackup= new ArrayList<>();
		
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
			
			estudia.add(new Estudiante(app,Integer.parseInt(cadaColor[0]),Integer.parseInt(cadaColor[1]),Integer.parseInt(cadaColor[2]),cadaNombre[0],cadaNombre[1],cadaDato[0],Integer.parseInt(cadaDato[1]),Integer.parseInt(cadaDato[2])));
			
//			}
		}
		
	}

	public void pintar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < estudia.size(); i++) {
			estudia.get(i).pintar(100, 50+30*i);
			
		}
		drawHash();
	}
	
	public void keyP(){
		if(app.keyCode=='1'){
			if(estudia.isEmpty()){
				estudia.addAll(estudBackup);
				estuSinRep.removeAll(estudia);
				estudBackup.removeAll(estudia);
				
			}
			Collections.sort(estudia);
			
			}
		
		if(app.keyCode=='2'){
			if(estudia.isEmpty()){
				estudia.addAll(estudBackup);
				estuSinRep.removeAll(estudia);
				estudBackup.removeAll(estudia);
				
			}
			ComparPeso pe= new ComparPeso();
			Collections.sort(estudia, pe);
				
			}
		
		if(app.keyCode=='3'){
			if(estuSinRep.isEmpty()){
				estuSinRep.addAll(estudia);
				estudBackup.addAll(estudia);
				estudia.removeAll(estuSinRep);
				
			}
//			
//			if(app.keyCode=='4'){
//				if(estudia.isEmpty()){
//					estudia.addAll(estuSinRep);
//					estuSinRep.removeAll(estudia);
//					
//				}
//
//			}
			}
		}
	
	public void drawHash(){
		Iterator<Estudiante> ithas = estuSinRep.iterator();
		int i =0;
while (ithas.hasNext()){
			
	Estudiante estudd = ithas.next();
			
			estudd.pintar(100, 50+30*i);
			i++;
		}
	}
	}


