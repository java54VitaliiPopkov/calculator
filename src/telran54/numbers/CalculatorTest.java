package telran54.numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		assertEquals(4.0, Calculator.sum(2, 2));
		assertEquals(0, Calculator.sum(2, -2));
		assertEquals(-2.5, Calculator.sum(2, -4.5));
	}

	@Test
	void testSubtract() {
		assertEquals(0, Calculator.subtract(2, 2));
		assertEquals(4.0, Calculator.subtract(2, -2));
		assertEquals(6.5, Calculator.subtract(2, -4.5));
	}

	@Test
	void testMultiply() {
		assertEquals(4, Calculator.multiply(2, 2));
		assertEquals(-4.0, Calculator.multiply(2, -2));
		assertEquals(5, Calculator.multiply(-2.5, -2));
	}

	@Test
	void testDivide() {
		assertEquals(2.5, Calculator.divide(5, 2));
		assertEquals(Double.NEGATIVE_INFINITY, Calculator.divide(-5, 0));
		assertEquals(Double.POSITIVE_INFINITY, Calculator.divide(5, 0));
		assertEquals(-2.5, Calculator.divide(-5, 2));
		assertEquals(2.5, Calculator.divide(-5, -2));
	}

}
