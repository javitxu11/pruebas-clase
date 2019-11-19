package pruebasEstructurasDatos;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Persona> personas = new ArrayList<>();
		Persona p = new Persona("Pepe","Sanchez",35);
		personas.add(p);
		Persona j= new Persona("John","Dominguez",21);
		personas.add(j);
		Persona a = new Persona("Aner","Lekue",21);
		personas.add(a);
		
		Collections.sort(personas);
		
		for ( Persona pe: personas) {
			System.out.println(pe);
		}
	}

}
