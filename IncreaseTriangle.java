import java.util.Scanner;
public class IncreaseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        for(int i = 1; i <= num1; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
