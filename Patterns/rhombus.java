public class rhombus {
    static void rhombusPat(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollowRhombus(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=row; j++) {
                if (i==1 || i==row || j==1 || j==row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhombusPat(5);
        hollowRhombus(5);
    }
}

/*

*****
 *****
  *****
   *****
    *****

* * * * *
 *       *
  *       *
   *       *
    * * * * *

*/