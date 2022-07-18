// Importing Scanner class
import java.util.*;
public class Investment{
	public static void main(String args[]){
		double IA, AR, N, FIA;
		// Taking input from the user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Investment Amount");
		IA = s.nextDouble();
		System.out.println("Enter Annual Interest Amount");
		AR = s.nextDouble();
		System.out.println("Enter Number of years Amount");
		N = s.nextDouble();
		// Assigning variable for power
		double c = (1 + (AR/ 1200));
		double d = N*12;
		// Calculating the problem
		FIA =IA * Math.pow(c, d);
		System.out.println(FIA);
}
}