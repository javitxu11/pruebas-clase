package pruebasEstructurasDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ejemploPila {
	

	
	public static void imprimirRecursivo(List<Integer> enteros) {
		 if(enteros.size()>1) {
			 imprimirRecursivo(enteros.subList(1, enteros.size()));
		 }
		 System.out.println(enteros.get(0));
	}
	
	public static void imprimirPila(List<Integer> enteros) {
		Stack<Integer> pila = new Stack<Integer>();
		
		//pila.addAll(enteros);
		for(Integer e : enteros) {
			pila.push(e);
		}
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> enteros = new ArrayList<Integer>();
		enteros.add(5);
		enteros.add(7);
		enteros.add(13);
		imprimirRecursivo(enteros);
		
		
	}

}
