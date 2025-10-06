import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSomar() {
		int a = 5;
		int b = 5;
		assertEquals(10, Calculadora.soma(a, b));
	}
	
	@Test
	void testMult() {
		int a = 5;
		int b = 5;
		assertEquals(25, Calculadora.mult(a, b));
	}
	
	@Test
	void testSub() {
		int a = 5;
		int b = 5;
		assertEquals(0, Calculadora.sub(a, b));
	}
	
	@Test
	void testDiv() {
		int a = 5;
		int b = 5;
		assertEquals(1, Calculadora.div(a, b));
	}
	
	
	@Test
	public void somaDouble() {
		double a = 2.5;
		double b = 2;
		
		assertEquals(4.5, Calculadora.soma(a, b));
	}
	
	
	@Test
	public void divZero() {
		int a = 10;
		int b = 0;
		
		assertEquals(0, Calculadora.div(a, b));
	}
	
	@Test
	public void divZero2() {
		int a = 0;
		int b = 10;
		
		assertEquals(0, Calculadora.div(a, b));
	}
	


	@Test
	public void divZero3() {
		double a = 5.0;
		double b = 2;
		
		assertEquals(2.5, Calculadora.div(a, b));
	}
	
	
	@Test
	public void divZero4() {
		double a = 0.6;
		double b = 0.2;
		
		assertEquals(3, Calculadora.div(a, b));
	}


}
