// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:

		// you arrive to the place with your freinds 
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		
		//you r 3 people
		int numdiners = 3;

		//you get the bill 
		int bill = Integer.parseInt(args[3]);
		
		//calulations in the "back"
		int payment = bill / numdiners;

		//you wanna do the payment
		System.out.println("okay thanks for eating here ");
		System.out.println("we are " + numdiners + name1 + name2 + name3 );
		System.out.println("you total" + bill );
		System.out.println("each has to pay " + payment );

	}
}
