public class mirrorImage {
    static void mirrorImageTriangle(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=row; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=row-1; i>=1; i--) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=row; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void mirrorImageTriangle1(int row) {
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=2; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        mirrorImageTriangle(4);
        System.out.println("\n");
        mirrorImageTriangle1(5);
    }
}

/*

1 2 3 4 
 2 3 4
  3 4
   4
  3 4
 2 3 4
1 2 3 4


1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/