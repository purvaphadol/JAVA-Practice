public class triangle {

    static void star(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollow_star(int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                if (j==1 || j==2*i-1 || i==row){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star(5);
        System.out.println("\n");
        hollow_star(5);
    }
}
/*
    *
   ***
  *****
 *******
*********


    *
   * *
  *   *
 *     *
*********
*/