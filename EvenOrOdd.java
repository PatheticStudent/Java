import javax.xml.transform.Source;
// Importing Scanner library
import java.util.*;
public class EvenOrOdd {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        //Taking input from the user
                int num1 = input.nextInt();
                // Checking if the number is even or odd
                if(num1 % 2 == 0){
                    System.out.println("The Number you entered is even");

                }
else{
                    System.out.println("The number that you entered is odd");
                }
    }
}
