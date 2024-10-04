public class hourGlass {
    static void hourGlassPat(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=row-1; i>=1; i--) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollowHourGlassPat(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=row; j++) {
                if (j==i || j==row || i==1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=row-1; i>=1; i--) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=row; j++) {
                if (j==i || j==row || i==1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        hourGlassPat(4);
        System.out.println("\n");
        hollowHourGlassPat(5);
    }
}

/*

* * * * 
 * * *
  * *
   *
  * *
 * * *
* * * *


* * * * *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
* * * * *

*/