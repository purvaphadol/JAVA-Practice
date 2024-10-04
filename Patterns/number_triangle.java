public class number_triangle {
    static void number(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
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

    static void number_des(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for (int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }
            for (int j=2; j<=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    static void number_diamond(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            for (int j=i-1; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=row-1; i>=1; i--) {
            for (int j=1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            for (int j=i-1; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number(5);
        System.out.println("\n");
        number_des(5);
        System.out.println("\n");
        number_diamond(6);
    }
}
/*
    1
   121
  12321
 1234321
123454321

        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

          1 
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
  1 2 3 4 5 4 3 2 1
    1 2 3 4 3 2 1
      1 2 3 2 1
        1 2 1 
          1

*/
