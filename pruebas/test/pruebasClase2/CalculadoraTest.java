package pruebasClase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(5, 3);
		assertEquals(8,resultado);
		
	}

}
