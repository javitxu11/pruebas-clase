package pruebasEstructurasDatos;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Integer> enteros = new ArrayList<Integer>();
		
		enteros.add(10);
		enteros.add(3);
		enteros.add(5);
		
		Collections.sort(enteros);
		
		for ( Integer e: enteros) {
			System.out.println(e);
		}
	}

}
