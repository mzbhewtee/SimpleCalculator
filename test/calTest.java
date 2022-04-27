// Import unit test class/methods
import org.junit.Test;

import junit.framework.Assert;

public class calTest {

// Initialize the test 

// Test for addition
	@Test
	public void testadd() {

		// create an instance of the class that the test will be performed on and check for it 
		// Efficacy
		Cal calculator = new Cal();
		double a = 5.0;
		double b = 5.0;
		double result;
		result = calculator.add(a, b);

		Assert.assertEquals(10.00, result);
	}

	// Test for subtraction
	@Test
	public void testsub() {

		// create an instance of the class that the test will be performed on and check for it 
		// Efficacy
		Cal calculator = new Cal();
		double a = 15.0;
		double b = 5.0;
		double result;
		result = calculator.sub(a, b);

		Assert.assertEquals(10.00, result);
	}

	// Test for multiplication
	@Test
	public void testmul() {

		// create an instance of the class that the test will be performed on and check for it 
		// Efficacy
		Cal calculator = new Cal();
		double a = 15.0;
		double b = 5.0;
		double result;
		result = calculator.mul(a, b);

		Assert.assertEquals(75.00, result);
	}

	// Test for division
	@Test
	public void testdiv() {

		// create an instance of the class that the test will be performed on and check for it 
		// Efficacy
		Cal calculator = new Cal();
		double a = 15.0;
		double b = 5.0;
		double result;
		result = calculator.div(a, b);

		Assert.assertEquals(3.00, result);
	}
	
	// Test for squared
	@Test
	public void testpow() {

		// create an instance of the class that the test will be performed on and check for it 
		// Efficacy
		Cal calculator = new Cal();
		double a = 5.0;
		double result;
		result = calculator.pow(a);

		Assert.assertEquals(25.00, result);
	}

	// Test for root
	@Test
	public void testroot() {

		// create an instance of the class that the test will be performed on and check for it 
		// Efficacy
		Cal calculator = new Cal();
		double a = 25.0;
		double result;
		result = calculator.root(a);

		Assert.assertEquals(5.00, result);
	}

	// Test for additive inverse
	@Test
	public void testaddInverse() {

		// create an instance of the class that the test will be performed on and check for it 
		// Efficacy
		Cal calculator = new Cal();
		double a = 5.0;
		double result;
		result = calculator.addInverse(a);

		Assert.assertEquals(-5.00, result);
	}
}
