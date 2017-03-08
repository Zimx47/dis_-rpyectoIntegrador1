import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private String[] nombres, datos, colores;
	private ArrayList<Estudiante> estudia;
	private ArrayList<Estudiante> estudBackup;
	private HashSet<Estudiante> estuHash;
	private TreeSet<Estudiante> estuTrees;

	public Logica(PApplet app) {
		this.app = app;

		nombres = app.loadStrings("data/nombres.txt");
		datos = app.loadStrings("data/datos.txt");
		colores = app.loadStrings("data/colores.txt");

		estudia = new ArrayList<>();
		estuHash = new HashSet<>();
		estuTrees = new TreeSet<>(new ComparEdad());
		estudBackup = new ArrayList<>();

		for (int i = 0; i < nombres.length; i++) {
			String[] cadaNombre = nombres[i].split(":");
			String[] cadaDato = datos[i].split("/");
			String[] cadaColor = colores[i].split("/");

			System.out.println(cadaNombre[0]);

			// String [] cadaNombre1= new String[20];
			// String [] cadaNombre2= new String[10];
			//
			// for (int j = 0; j < cadaNombre.length; j++) {
			//
			// cadaNombre[j]= cadaNombre1[1];
			// System.out.println(cadaNombre1[1]);

			estudia.add(new Estudiante(app, Integer.parseInt(cadaColor[0]), Integer.parseInt(cadaColor[1]),
					Integer.parseInt(cadaColor[2]), cadaNombre[0], cadaNombre[1], cadaDato[0],
					Integer.parseInt(cadaDato[1]), Integer.parseInt(cadaDato[2])));

			// }
		}

	}

	public void pintar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < estudia.size(); i++) {
			estudia.get(i).pintar(100, 50 + 30 * i);

		}
		drawTree();
		drawHash();
	}

	public void keyP() {
		if (app.keyCode == '1') {
			if (estudia.isEmpty()) {
				estudia.addAll(estudBackup);
				estuTrees.removeAll(estudia);
				estuHash.removeAll(estudia);
				estudBackup.removeAll(estudia);

			}
			Collections.sort(estudia);

		}

		if (app.keyCode == '2') {
			if (estudia.isEmpty()) {
				estudia.addAll(estudBackup);
				estuTrees.removeAll(estudia);
				estuHash.removeAll(estudia);
				estudBackup.removeAll(estudia);

			}
			ComparPeso pe = new ComparPeso();
			Collections.sort(estudia, pe);

		}

		if (app.keyCode == '3') {
			if (estuTrees.isEmpty()) {

				if (estudBackup.isEmpty()) {
					estudBackup.addAll(estudia);
					estuTrees.addAll(estudia);
					estudia.removeAll(estudBackup);

				} else if (!estudBackup.isEmpty()) {
					estuHash.removeAll(estudBackup);
					estuTrees.addAll(estudBackup);
					// estudia.removeAll(estudBackup);

				}
			}}

			if (app.keyCode == '4') {
				
				if (estuHash.isEmpty()) {
					
					if (estudBackup.isEmpty()) {
						estudBackup.addAll(estudia);
						estuHash.addAll(estudia);

						estudia.removeAll(estudBackup);

					} else if (!estudBackup.isEmpty()) {
						
						estuTrees.removeAll(estudBackup);
						estuHash.addAll(estudBackup);

					
				}

			}
		}
	}

	public void drawTree() {
		Iterator<Estudiante> ithas = estuTrees.iterator();
		int i = 0;
		while (ithas.hasNext()) {

			Estudiante estudd = ithas.next();

			estudd.pintar(100, 50 + 30 * i);
			i++;
		}
	}

	public void drawHash() {
		Iterator<Estudiante> ithas2 = estuHash.iterator();
		int i2 = 0;
		while (ithas2.hasNext()) {

			Estudiante estudd2 = ithas2.next();

			estudd2.pintar(100, 50 + 30 * i2);
			i2++;
		}
	}
}
