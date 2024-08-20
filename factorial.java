import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find its factorial : ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=num; i++) {
            fact *= i;
        }
        System.out.print("Factorial of "+ num + " is : "+ fact);
    }
}