package main.java.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedidorTest {
	
	Medidor medidor = new Medidor("ARES","7021","TB");
	
	@Test
	public void testGetId() {
		medidor.setId(17);
		assertEquals("Checking if get is returned a correct value for id", 17, medidor.getId());
	}
	
	@Test
	public void testGetLinha() {
		medidor.setLinha("ZEUS");
		assertEquals("Checking if get is returned a correct value for line", "ZEUS", medidor.getLinha());
	}

	@Test
	public void testGetModelo() {
		medidor.setModelo("8023 2,5");
		assertEquals("Checking if get is returned a correct value for model", "8023 2,5", medidor.getModelo());
	}

	@Test
	public void testGetCategoria() {
		medidor.setCategoria("Indireto");
		assertEquals("Checking if get is returned a correct value for category", "Indireto", medidor.getCategoria());
	}

}
