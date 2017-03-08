import java.util.Comparator;

public class ComparPeso implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		// TODO Auto-generated method stub
		return o1.getPeso()-o2.getPeso();
	}

}
