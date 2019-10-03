package pruebasClase2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora c;
	
	@Before
	public void setUp() {
		 c = new Calculadora();
	}
	
	@Test
	public void testSumar() {
		int resultado = c.sumar(5, 3);
		assertEquals(8,resultado);
	}
	
	@Test
	public void testRestar() {
		assertEquals(3,c.restar(10, 7));	
	}
	
	@Test
	public void testMultiplicar() {
		assertEquals(4,c.multiplicar(2, 2));
	}
	
	@Test
	public void testCuadrado() {
		assertEquals(4.0,c.cuadrado(2), 0.0);
	}
}
