public class numPat {

    static void pattern1(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            for (int j=1; j<=2*(row-i); j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern2(int row) {
        int num=1;
        int r=row;
        for (int i=1; i<=row; i++) {
            for (int j=1; j<i; j++) {
                System.out.print("  ");
            }
            for (int j=i; j<=row; j++) {
                System.out.print(num +" ");
                num++;
            }

            int end = (row*(row+1)/2)+(r*(r+1)/2);
            int start = end-(row-i);

            for (int j=i; j<=row; j++) {
                System.out.print(start+" ");
                start++;
            }
            r--;
            System.out.println();
        }

        // int r=row;
        // for (int i=1; i<=row; i++) {
            
        //     int end= r*(r+1)/2;
        //     int start = end-(row-i);

        //     for (int j=i; j<=row; j++) {
        //         System.out.print(start);
        //         start++;
        //     }
        //     r--;
        //     System.out.println();
        // }        
    }

    static void pattern3(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=2*(row-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                if (j==1 || j== 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j=1; j<=2*(row-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                if (j==1 || j== 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(5);
    }
}

/*
1        1
12      21
123    321
1234  4321
1234554321

1 2 3 4 17 18 19 20 
  5 6 7 14 15 16
    8 9 12 13
      10 11

   *      *
  ***    ***
 *****  *****
**************

    *        *
   * *      * *
  *   *    *   *
 *     *  *     *
*       **       *

*/