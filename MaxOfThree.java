// Importing Scanner Class
import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        // write your code here
        //Taking input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 numbers that you want to check");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
    // Checking the max of three numbers
        if(num1 > num2 && num1 > num3) {
            System.out.println(num1);
        }
            else if(num2 > num1 && num2 > num3){
            System.out.println(num2);
            }
            else {
            System.out.println(num3);
        }
    }
        }
