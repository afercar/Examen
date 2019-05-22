package com.empresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {

	@Test
	public void testGetNombre() {
		System.out.println("Funcionamiento GETNOMBRE");
		Empleado e = new Empleado("Juan", 105, "calle alcornoque", 1250);
		assertTrue(e.getNombre() == "Juan");
	}
	@Test
	public void testGetCedula() {
		System.out.println("Funcionamiento GETCEDULA");
		Empleado e = new Empleado("Juan", 105, "calle alcornoque", 1250);
		assertTrue(e.getCedula() == 105);
	}
	@Test
	public void testGetDireccion() {
		System.out.println("Funcionamiento GETDIRECCION");
		Empleado e = new Empleado("Juan", 105, "calle alcornoque", 1250);
		assertTrue(e.getDireccion() == "calle alcornoque");
	}
	@Test
	public void testGetSalario() {
		System.out.println("Funcionamiento GETSALARIO");
		Empleado e = new Empleado("Juan", 105, "calle alcornoque", 1250);
		assertTrue(e.getSalario() == 1250);
	}

}
