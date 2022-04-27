// Set the class to public as it will be used for both testing and in the calculator app

public class Cal {
	
	// Create the add function, return the sum
	public Double add(double a, double b) {
		double sum;
		sum = a+b;
		return sum;
	}

	// Create the subtraction function, return the result
	public Double sub(double a, double b) {
		double result;
		result = a-b;
		return result;
	}
	
	// Create the division function, return the result
	public Double div(double a, double b) {
		double result;

		// if either the first or the second input is zero, return null
		if(a==0 | b==0) {
			return null;
		}
		else {
			result = a/b;
		}
		return result;
	}

	// Create the multiplication function, return the result
	public Double mul(double a, double b) {
		double result;
		result = a*b;
		return result;
	}

	// Create the percentage function, return the result
	public Double per(double a, double b) {
		double result;
		result = (a*b)/100;
		return result;
	}

	// Create the power function, return the result
	public Double pow(double a) {
		double result;
		result = (a*a);
		return result;
	}

	// Create the root function, return the result
	public Double root(double a) {
		double result;
		result = java.lang.Math.sqrt(a);
		return result;
	}

	// Create the additive Inverse function, return the result
	public Double addInverse(double a) {
		double result;
		result = a*(-1);
		return result;
	}
}

