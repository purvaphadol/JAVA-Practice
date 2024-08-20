import java.util.*;

public class checkprime {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to check primr or not : ");
        int n = sc.nextInt();
        boolean isprime=true;

        if (n == 2) {
            System.out.print("prime");
        }
        else {
            for (int i=2; i<=Math.sqrt(n); i++) {
                if (n%i == 0) {
                    isprime=false;
                    break;
                }
            }
            if (isprime==true) {
                System.out.print("Prime");
            }
            else {
                System.out.print("Not Prime");
            }
        }
    }
}