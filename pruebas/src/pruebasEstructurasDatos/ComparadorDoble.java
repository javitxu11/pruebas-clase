package pruebasEstructurasDatos;

import java.util.Comparator;

public class ComparadorDoble implements Comparator<Persona> {

	@Override
	public int compare(Persona a, Persona b) {
		int resultado = a.getApellido().compareTo(b.getApellido());
		if(resultado==0) {
			ComparadorEdad comparadorEdad= new ComparadorEdad();
			return comparadorEdad.compare(a, b);
		}else {
			return resultado;
		}
		
	}

}
