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
		assertEquals(p.getNombreCompleto(),"Gonzalez, Javi");
	}

}
