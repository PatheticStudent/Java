import java.util.Scanner;	// importing scanner class

// Calcualting BMI and Check in which category they lie
public class BMICalculator
{
	public static void main (String args[]){
	Scanner input = new Scanner(System.in);
	//Taking input from user
	System.out.println("Enter the weight of user");
	double weight = input.nextDouble();
	double W = weight  * 0.45359237;
	System.out.println("Enter the height of user");
	double height = input.nextDouble(); 
	double H = height * 0.0254;
	 // Calcualting BMI
	double bodyMassIndex = (W/(H*H));   
	// printing BMI
	System.out.println(bodyMassIndex);
	//Checking Conditions
	if(bodyMassIndex < 18.5){
	System.out.println("Under Weight");
	}
	
	else if(bodyMassIndex >= 18.5 && bodyMassIndex < 25.0){
		// Check if The Condition is true
	System.out.println("Normal");
	}
	else if(bodyMassIndex >= 25.0 && bodyMassIndex < 30.0){
	System.out.println("Over Weight");
	}
	else{
	System.out.println("Obese");
	}
	}
}
		