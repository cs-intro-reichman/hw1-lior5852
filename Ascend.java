
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);

		//now i have 3 nubers between 0to1
		double a = (Math.random());
		double b = (Math.random());
		double c = (Math.random());
		
		//now i have 3 nubers between 0toX
		int num1 = (int)(a * x);
		int num2 = (int)(b * x);
		int num3 = (int)(c * x);
		
		//finding the numbers 

		int smallest = Math.min(Math.min(num1, num2),num3);

		int biggest = Math.max(Math.max(num1, num2),num3);
	
		int middle = (num1 + num2 + num3) - (smallest + biggest);

		//getting them in order
		System.out.println(num1 + " " + num2 + " " +  num3);
		System.out.println(smallest + " " + middle + " " +  biggest);

	}
}
