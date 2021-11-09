package Models;

public class Operacao {

	public double Soma(double x, double y) {
		return x + y;
	}

	public double Sub(double x, double y) {
		return x-y;
	}

	public double Mult(double x, double y) {
		return x*y;
	}

	public double Div(double x, double y) {
		if(y == 0 ) {
			return 0;
		}else {
			return x/y;
		}
	}

}
