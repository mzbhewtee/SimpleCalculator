import org.junit.Test;

import junit.framework.Assert;

public class calTest {

	@Test
	public void testadd() {
		Cal calculator = new Cal();
		double a = 5.0;
		double b = 5.0;
		double result;
		result = calculator.add(a, b);

		Assert.assertEquals(10.00, result);
	}
	@Test
	public void testsub() {
		Cal calculator = new Cal();
		double a = 15.0;
		double b = 5.0;
		double result;
		result = calculator.sub(a, b);

		Assert.assertEquals(10.00, result);
	}
	@Test
	public void testmul() {
		Cal calculator = new Cal();
		double a = 15.0;
		double b = 5.0;
		double result;
		result = calculator.mul(a, b);

		Assert.assertEquals(75.00, result);
	}
	@Test
	public void testdiv() {
		Cal calculator = new Cal();
		double a = 15.0;
		double b = 5.0;
		double result;
		result = calculator.div(a, b);

		Assert.assertEquals(3.00, result);
	}
	
	@Test
	public void testpow() {
		Cal calculator = new Cal();
		double a = 5.0;
		double result;
		result = calculator.pow(a);

		Assert.assertEquals(25.00, result);
	}
	@Test
	public void testroot() {
		Cal calculator = new Cal();
		double a = 25.0;
		double result;
		result = calculator.root(a);

		Assert.assertEquals(5.00, result);
	}
	@Test
	public void testaddInverse() {
		Cal calculator = new Cal();
		double a = 5.0;
		double result;
		result = calculator.addInverse(a);

		Assert.assertEquals(-5.00, result);
	}
}
