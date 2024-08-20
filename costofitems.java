import java.util.*;

public class costofitems {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;
        System.out.println("Total Cost is " + total);
        
        float tax = 0.18f * total;
        float newtotal = total + tax;
        System.out.println("Total Cost with tax is " + newtotal );
    }
}