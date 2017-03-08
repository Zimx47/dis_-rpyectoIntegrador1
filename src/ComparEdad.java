import java.util.Comparator;

public class ComparEdad implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		// TODO Auto-generated method stub
		return o2.getEdad()-o1.getEdad();
	}

}
