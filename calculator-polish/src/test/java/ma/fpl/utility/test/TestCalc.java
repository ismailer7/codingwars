package ma.fpl.utility.test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ma.fpl.utility.Calc;

public class TestCalc {

	@Test
	public void test() {
		assertEquals(9, Calc.evaluate("5 4 +"), 0.0);
		assertEquals(14, Calc.evaluate("5 1 2 + 4 * + 3 -"), 0.0);
		assertEquals(0, Calc.evaluate(""), 0.0);
		assertEquals(3, Calc.evaluate("3"), 0.0);
		assertEquals(3.5, Calc.evaluate("3.5"), 0.0);
		assertEquals(6, Calc.evaluate("4 2 +"), 0.0);
		assertEquals(0.5, Calc.evaluate("1 2 /"), 0.0);
	}
	
	
	
	
	
	
}
