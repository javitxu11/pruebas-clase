package pruebasClase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSumar() {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(5, 3);
		assertEquals(8,resultado);
		
	}

	
	@Test
	public void testRestar() {
		Calculadora c= new Calculadora();
		assertEquals(3,c.restar(10, 7));
		
		
	}
	
}
