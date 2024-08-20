public class largestoftheee {
    public static void main(String args[]) {
        int a=1, b=3, c=6;

        if ( (a>=b) && (a>=c) ) {
            System.out.println("A is Largest");
        }
        else if (b>=c) {
            System.out.println("B is Largest");
        }
        else {
            System.out.println("C is Largest");
        }

        // if ( a>=b) {
        //     if (a>c) {
        //         System.out.println("A is Largest");
        //     }
        //     else {
        //         System.out.println("C is Largest");
        //     }
        // }
        // else {
        //     if (b>c) {
        //         System.out.println("B is Largest");
        //     }
        //     else {
        //         System.out.println("C is Largest");
        //     }
        // }
    }
}