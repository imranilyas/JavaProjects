package day7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator calc;
	
	@BeforeAll
	public static void constructCalculator() {
		calc = new Calculator(10, 2);
	}
	
	@Test
	void addTest() {
		int expected = 12;
		int actual = calc.add();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void addFailsTest() {
		int unexpected = 10;
		int actual = calc.add();
		
		assertNotEquals(unexpected, actual);
	}
	
	@Test
	void subtractTest() {
		int expected = 8;
		int actual = calc.subtract();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void subtractFailsTest() {
		int unexpected = 42;
		int actual = calc.subtract();
		
		assertNotEquals(unexpected, actual);
	}
	
	@Test
	void multiplyTest() {
		int expected = 20;
		int actual = calc.multiply();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void multiplyFailsTest() {
		int unexpected = 1;
		int actual = calc.multiply();
		
		assertNotEquals(unexpected, actual);
	}
	
	@Test
	void divideTest() {
		double expected = 5;
		double actual = calc.divide();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void divideFailsTest() {
		double unexpected = 2;
		double actual = calc.divide();
		
		assertNotEquals(unexpected, actual);
	}

}
