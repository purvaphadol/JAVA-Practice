import java.util.*;

public class multipleoften {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        // keep entering numbers till user enters a multiple of 10
        do 
        {
            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            if (n%10 == 0) 
            {
                break;
            }
            System.out.println(n); 
        }  while (true);

        // display all the numbers entered by user except multiple of 10
        // do 
        // {
        //     System.out.print("Enter Number : ");
        //     int n = sc.nextInt();
        //     if (n%10 == 0) 
        //     {
        //         continue;
        //     }
        //     System.out.println(n); 
        // }  while (true);      
    }
}
