package pruebasEstructurasDatos;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Persona> {

	@Override
	public int compare(Persona a, Persona b) {
		
		return a.getApellido().compareTo(b.getApellido());
		
	}
}
