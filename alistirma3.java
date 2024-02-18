package alistirma;

public class alistirma3 {
	public static void main(String args[]) {
		double f = 1;
		double res = 1;
	    for(double i=1;i<=Integer.MAX_VALUE;i++) {
	        f *= i;
	        res += (1/f) ;
	    }
	    System.out.println(res);
		
	}
}
