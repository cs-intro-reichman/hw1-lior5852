// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
	

	// משתנה יחיד כי ארגומנט זה על כל ״קובייה״
	int num = Integer.parseInt(args[0]);

	// כדי להגיע למספר מאות אז נחלק ב100
	int houndreds = num/100; 
	num = num - (houndreds*100);

	// כדי להגיע למספר מאות אז נחלק ב10
	int tens = num/10;
	num = num - (tens*10);

	// זו השארית הסופית
	int ones = num;

	System.out.println(houndreds + " hundreds," + tens + " tens, and " + ones + " ones.");
	}
}
