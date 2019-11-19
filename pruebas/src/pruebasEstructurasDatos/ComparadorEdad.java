package pruebasEstructurasDatos;

import java.util.Comparator;

public class ComparadorEdad  implements Comparator<Persona>{

	@Override
	public int compare(Persona a, Persona b) {
		if(a.getEdad()<b.getEdad()) {
			return -1;
		}
		if(a.getEdad()>b.getEdad()) {
			return 1;
		}
		return 0;
	}

	
	
}
