package util;

public class CurrencyConverter {
	public static final double IOF = 6;
	
	public static double convert(double cot, double dol) {
		return (cot*dol)*(IOF/100)+(cot*dol);
	}

}
