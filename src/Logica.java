import processing.core.PApplet;

public class Logica {
	
	private PApplet app;
	private String[] nombres, datos, colores;
	
	
	public Logica(PApplet app) {
		this.app=app;
		
		
		nombres= app.loadStrings("data/nombres.txt");
		datos= app.loadStrings("data/datos.txt");
		colores= app.loadStrings("data/colores.txt");
		
		for (int i = 0; i < nombres.length; i++) {
			String [] cadaNombre = nombres[i].split(":");
			
			System.out.println(cadaNombre[0]);
			
//		String [] cadaNombre1= new String[20];
//		String [] cadaNombre2= new String[10];
//			
//			for (int j = 0; j < cadaNombre.length; j++) {
//				
//				cadaNombre[j]= cadaNombre1[1];
//				System.out.println(cadaNombre1[1]);
//			}
		}
		
	}

	public void pintar() {
		// TODO Auto-generated method stub
		
	}

}
