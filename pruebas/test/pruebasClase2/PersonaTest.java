package pruebasClase2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonaTest {
	private Persona p;
	@Before
	public void setUp() {
		p =new Persona("Javi","Gonzalez");
		
	}
	@Test
	public void testGetNombreCompleto() {
		assertEquals("Gonzalez, Javi",p.getNombreCompleto());
	}
	
	@Test
	public void testGetNombre() {
		assertEquals("Javi" , p.getNombre());
	}
	@Test
	public void testGetApellido() {
		assertEquals("Gonzalez",p.getApellido());
	}
}
