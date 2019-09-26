package pruebasClase1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Swings {

	private static List<Integer> list = Collections.synchronizedList (new ArrayList<Integer>());
	
	
	public static void main(String[] args) {
		Thread tInsertar = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					list.add(100);
					System.out.println("Añadido un numero: " +list);
				}
			}
		});
		
		
		tInsertar.run();
		
		Thread rProcesar = new Thread(new Runnable() {
			
			@Override
			public void run() {
				if(!list.isEmpty()) {
					list.remove(0);
					System.out.println("");
				}
				
			}
		});
		rProcesar.run();
		
	}

}
