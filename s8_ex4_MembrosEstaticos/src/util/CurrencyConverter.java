package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double Conversion(double dollarPrice, double dollarsWillBeBought) {
		return dollarsWillBeBought * dollarPrice * (1.0 + IOF);
	}	
}
