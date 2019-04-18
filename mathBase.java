package mathCal;

public class mathBase {
	public static int add(int first, int second) {
		return first + second;	
	}
	
	public static int multiply(int x, int y) {
		return x*y;
	}
	
	public static int divide(int dividend , int  divisor) {
		if(divisor==0) 
			throw new IllegalArgumentException("sonsuz");
		
		return dividend/divisor;
	}
}
