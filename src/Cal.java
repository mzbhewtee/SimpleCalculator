public class Cal {
	
	public Double add(double a, double b) {
		double sum;
		sum = a+b;
		return sum;
	}
	public Double sub(double a, double b) {
		double result;
		result = a-b;
		return result;
	}
	double result;
	public Double div(double a, double b) {
		if(a==0 | b==0) {
			return null;
		}
		else {
			result = a/b;
		}
		return result;
	}
	public Double mul(double a, double b) {
		double result;
		result = a*b;
		return result;
	}
	public Double per(double a, double b) {
		double result;
		result = (a*b)/100;
		return result;
	}
	public Double pow(double a) {
		double result;
		result = (a*a);
		return result;
	}
	public Double root(double a) {
		double result;
		result = java.lang.Math.sqrt(a);
		return result;
	}
	public Double addInverse(double a) {
		double result;
		result = a*(-1);
		return result;
	}
}

