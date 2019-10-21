package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	/*
	 * Basic multiplication test 5 * 5 = 25
	 */
	
	void multiplyTest() {
		
		Calculator calc = new Calculator();
		
		calc.add(5); // give initial value
		calc.multiply(5);
		
		assertEquals(25, calc.getTotal());
		assertEquals("0 + 5 * 5 ", calc.toString());
	}
	
	@Test
	/*
	 * Negative multiplication test 5 * -5 = -25
	 */
	
	void multiplyByNegitiveTest() {
		
		Calculator calc = new Calculator();
		
		calc.add(5); // give initial value
		calc.multiply(-5);
		
		assertEquals(-25, calc.getTotal());
		assertEquals("0 + 5 * -5 ", calc.toString());
	}
	
	@Test
	/*
	 * Basic division test 5 / 5 = 1
	 */
	
	void divideTest() {
		
		Calculator calc = new Calculator();
		
		calc.add(5); // give initial value
		calc.divide(5);
		
		assertEquals(1, calc.getTotal());
		assertEquals("0 + 5 / 5 ", calc.toString());
	}
	
	@Test
	/*
	 * Division by 0 test 5 / 0 = 0
	 */
	
	void divideByZeroTest() {
		
		Calculator calc = new Calculator();
		
		calc.add(5); // give initial value
		calc.divide(0);
		
		assertEquals(0, calc.getTotal());
		assertEquals("0 + 5 / 0 ", calc.toString());
	}
	
	@Test
	/*
	 * Non clean division test 5 / 2 = 2. (2.5 in the real world)
	 */
	
	void divideNonCleanTest() {
		
		Calculator calc = new Calculator();
		
		calc.add(5); // give initial value
		calc.divide(2);
		
		assertEquals(2, calc.getTotal());
		assertEquals("0 + 5 / 2 ", calc.toString());
	}
	
	@Test
	/*
	 * Negative division test 5 / -5 = -1
	 */
	
	void divideByNegitiveTest() {
		
		Calculator calc = new Calculator();
		
		calc.add(5); // give initial value
		calc.divide(-5);
		
		assertEquals(-1, calc.getTotal());
		assertEquals("0 + 5 / -5 ", calc.toString());
	}
	
	@Test
	/*
	 * Basic power test 5 ^ 5 = 3125
	 */
	
	void powerTest() {
		
		Calculator calc = new Calculator();
		
		calc.add(5); // give initial value
		calc.power(5);
		
		assertEquals(3125, calc.getTotal());
		assertEquals("0 + 5 ^ 5 ", calc.toString());
	}

	@Test
	/*
	 * Negative power test 5 ^ -5 = 0
	 */
	
	void powerToNegativeTest() {
		
		Calculator calc = new Calculator();
		
		calc.add(5); // give initial value
		calc.power(-5);
		
		assertEquals(0, calc.getTotal());
		assertEquals("0 + 5 ^ -5 ", calc.toString());
	}
}
