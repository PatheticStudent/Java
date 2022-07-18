import java.util.Scanner;
public class Equation{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		double a = input.nextDouble();
		System.out.println("Enter the value of x2");
		double b = input.nextDouble();
		System.out.println("Enter the value of x3");
		double c = input.nextDouble();
		System.out.println("Enter the value of x4");
		double d= input.nextDouble();
		System.out.println("Enter the value of x5");
		double e = input.nextDouble();
		System.out.println("Enter the value of x6");
		double f = input.nextDouble();
		
		double x = (e*d -b*f)/(a*d - b*c);
		double y = (a*f -e*c)/(a*d - b*c);
					System.out.println("The value of x is " + x);
					System.out.println("The value of y is " + y);					
		
	}
}