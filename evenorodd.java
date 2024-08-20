
public class evenorodd {
    public static void main(String args[]) {
        int a=6;
        // if (a % 2 == 0) {
        //     System.out.println("even");
        // }
        // else {
        //     System.out.println("odd");
        // }

        String type = ( (a%2) ==0 ) ? "Even" : "Odd";
        System.out.println(type);
    }
}