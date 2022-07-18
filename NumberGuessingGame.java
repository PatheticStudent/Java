// Importing scanner class
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        // Implementing rand function
int num1 = (int) ((Math.random() )* 10);
int num2 = (int) ((Math.random() )* 10);
//Taking input from the user
Scanner input = new Scanner(System.in);
        System.out.println(num1  + "-" + num2 +"=");
        int num3 = input.nextInt();
        int num4 = num1 - num2;
        //Checking if answer is true or not
        if(num4 == num3 ){
            System.out.println("Your answer "+ num3 + " is correct");

        }
        else {
            System.out.println("Your answer "+ num3 + " is incorrect");
            System.out.println("The Correct answer is " + num4 );
        }
    }
}
