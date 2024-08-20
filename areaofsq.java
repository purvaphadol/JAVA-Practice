
import java.util.*;

// Area of a Square

public class areaofsq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Side of Square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.print("Area of Square: " + area);
    }
}
