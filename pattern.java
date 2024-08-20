
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        // *
        // **
        // ***
        // ****
        // for (int i=0; i<=4; i++) {
        //     for (int j=0; j<i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Print INVERTED STAR Pattern
        // ****
        // ***
        // **
        // *
        // for (int i=1; i<=4; i++) {
        //     for (int j=1; j<=(4-i+1); j++) { // for (int j=4; j>=i; j--)
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Print HALF PYRAMID Pattern
        // 1
        // 12
        // 123
        // 1234
        // for (int i=1; i<=4; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 1
        // 22
        // 333
        // 4444
        // for (int i=1; i<=4; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // Print CONTINUOUS NUMBER Pattern
        // 1
        // 23
        // 456
        // 78910
        // int num =1;
        // for (int i=1; i<=4; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }

        // Print CHARACTER Pattern
        // A
        // BC
        // DEF
        // GHIJ
        // char ch='A';
        // for (int i=1; i<=4; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=5; i++)
        {
            for (int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++)
        {
            for (int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=5; j++) {
                if (i==1 || i==5 || j==1 ||j==5) {
                System.out.print("*");
                }
                else {
                System.out.print(" ");

                }
            }
            System.out.println();
        }

        for (int i=1; i<=4; i++) {
            for(int j=1; j<=4-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                if (i==1 || i==4 ||j==1||j==4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=4; i>=1; i--) {
            for(int j=1; j<=4-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++) {
                if (i==1 || i==4 ||j==1||j==4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }

        for (int i=5;i>=1;i--) {
            for (int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1;i<=5;i++) {
            for (int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }

        for (int i=1;i<=5;i++) {
            for (int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        for (int i=1;i<=5;i++) {
            for (int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            for (int j=i-1; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}