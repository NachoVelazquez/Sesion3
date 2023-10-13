package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	static Cuenta cta67890;
	static Cuenta cta12345;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cta67890=new Cuenta(0,"67890");
		cta12345=new Cuenta(50,"12345");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cta67890.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cta67890.ingresar(3000);
		assertEquals(3000,cta67890.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cta67890.retirar(300);
		assertEquals(-300,cta67890.getSaldo());
	}
	
	@Test
	void testRetirarLimite() {
		cta67890.retirar(3000);
		assertEquals(0,cta67890.getSaldo());
	}
	
	@Test
	void test0014() {
		cta12345.retirar(200);
		cta67890.retirar(350);
		cta12345.ingresar(100);
		cta67890.retirar(200);
		cta67890.retirar(150);
		cta12345.retirar(200);
		cta67890.ingresar(50);
		cta67890.retirar(100);
		assertEquals(-250,cta12345.getSaldo());
		assertEquals(-450,cta67890.getSaldo());
	}
	
	
}
