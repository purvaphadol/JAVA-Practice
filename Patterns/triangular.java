public class triangular {
    static void star(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void star_reverse(int row) {
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void hollow_star(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                if (j==1 || j==i || i==row){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void number(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star(5);
        System.out.println("\n");
        star_reverse(5);
        System.out.println("\n");
        hollow_star(5);
        System.out.println("\n");
        number(5);
    }
}

/*
    * 
   * *
  * * *
 * * * *
* * * * *

* * * * *
 * * * *
  * * *
   * *
    *

    *
   * *
  *   *
 *     *
* * * * *

    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

*/