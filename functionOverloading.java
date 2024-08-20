
import java.util.*;

public class functionOverloading {
    public static int sum(int a, int b) {
        int s = a + b;
        return s;
    }
    // Sum is : 10

    // public static int sum(float a, int b) {
    //     int s = (int) (a + b);
    //     return s;
    // }
    // Sum is : 10

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static float sum(float a, float b, float c) {
        return (a+b+c);
    }
    // Sum is : 15.900001

    // public static int sum(float a, float b, float c) {
    //     return (int) (a+b+c);
    // }
    // Sum is : 15

    public static void main(String args[]) {
        System.out.println("Sum is : " + sum(5,5));
        System.out.println("Sum is : " + sum(5,5,5));
        System.out.println("Sum is : " + sum(5.2f,5.4f,5.3f));
    }
}