//Importing Scanner Class
import java.util.*;
// Project name Student grades
public class CalculateStudentGrades {
   public static void main(String args[]) {
	   // Declaring Scanner Class
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter average of your marks (less than 100)::");
	  //Takinng input from the users
      int average = sc.nextInt();
      String grade = "";

     if(average>=85 && average <=100)
	  {
         grade = "AA";
	  }
		      else if(average>=75 && average<=84){
         grade = "AB";
			  }
		  else if(average>=65 && average<=74){
         grade = "BB";
      }
	  else if(average>=55 && average<65){
         grade = "BC";
      }
      else if(average>=45 && average<55){
         grade = "CC";
	  }
		  else if(average>=40 && average<45){
         grade = "CD";
      }
      else if(average>=35 && average <40){
         grade = "DD";
      }
else if (average<35 && average >0){
grade = "FF";
}
else{
	grade = "Invalid";
}


      System.out.println("Your grade is " + grade);
   }
}
