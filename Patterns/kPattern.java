public class kPattern {
    static void k_pat(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=row; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
         for (int i=2; i<=row; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat1(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         for (int i=row-1; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        k_pat(6);
        pat1(5);
    } 

}
/*
* * * * * * 
* * * * *
* * * *
* * *
* *
*
* *
* * *
* * * *
* * * * *
* * * * * *


*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/
