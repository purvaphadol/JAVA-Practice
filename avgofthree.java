
import java.util.*;

//average of Three numbers
public class avgofthree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 no.:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("Average"+avg);
    }
}