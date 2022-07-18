import java.util.Scanner;
public class DecreaseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        for(int i = 1; i <= num1; i++)
        {
            for (int j = i; j <= num1; j++)
            {
                System.out.print("*");
            }

            System.out.println(" ");
        }

    }
}