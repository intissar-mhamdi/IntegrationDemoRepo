package edu.esprit.ci.demo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.esprit.ci.demo.Calculator;

public class CalculatorTest {

	Calculator calculator;

	@Before
	public void setUp() throws Exception {

		calculator = new Calculator();
	}

	@Test
	public void test() {


		assertEquals(10, calculator.add(2,3,5));

	}

}
