// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		// the invested sum
		int currentvalue = Integer.parseInt(args[0]);

		// the annual intrest rate
		double rate =Double.parseDouble(args[1]); 

		// the number of years
		int years = Integer.parseInt(args[2]);

		// the totall with 2 diffrent opertaions
		double a = (rate/ 100) + 1 ;

		double b = Math.pow(a,years);

		// the totall + notlost any info

		int totall = (int)(currentvalue * b);

		System.out.println("After " + years + " years, $" + currentvalue + " saved at " + rate + "% will yield $" + totall);
		
	}
}