import processing.core.PApplet;

public class Ejecutable extends PApplet{
	
	private Logica log;
	public static PApplet app;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Ejecutable");


	}
	
	public void setup() {
		app = this;
		log = new Logica(this);
	}
	
public void settings() {
		
		size(1200, 700);

	}

public void draw() {
	background(255);
	log.pintar();

}

public void keyPressed(){
	log.keyP();
}

}
