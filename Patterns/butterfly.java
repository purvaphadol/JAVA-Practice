public class butterfly {
    static void butterfly_pat(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for (int j=1; j<=2*(row-i); j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for (int j=1; j<=2*(row-i); j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollow_butterfly_pat(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=i; j++) {
                if(j==1 || j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j=1; j<=2*(row-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                if(j==1 || j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=row-1; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                if(j==1 || j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j=1; j<=2*(row-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                if(j==1 || j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly_pat(4);
        System.out.println("\n");
        hollow_butterfly_pat(4);
    }
}

/*

*             * 
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             * 


*      *
**    **
* *  * *
*  **  *
* *  * *
**    **
*      *

*/