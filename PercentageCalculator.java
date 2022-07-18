import java.util.Scanner;
class PercentageCalculator{
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total of all 5 Subjects");
        int total = sc.nextInt();
        System.out.println("Enter the marks of the Subject out of 100");
        double num1 = sc.nextDouble();
        double num5 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
      

        double Percentage = ((num1 + num2 + num3 + num4 +num5)/total)*100;

        System.out.println("The percentage of Student is " + Percentage);
        



    
    
    
    }
}