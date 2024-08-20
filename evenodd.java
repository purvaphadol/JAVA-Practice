
import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int evenSum=0;
        int oddSum=0;

        do {
            System.out.print("Enter No. : ");
            int num = sc.nextInt();
            if (num%2 == 0) {
                evenSum += num;
            }
            else {
                oddSum += num;
            }
            System.out.print("Do you want to continue (y/n) ? ");
            ch = sc.next().charAt(0);
        }
        while (ch =='y'); 
        System.out.println("Even Sum : " + evenSum);
        System.out.println("Odd Sum : " + oddSum);


    }
}