public class pasclas {
    static void pasclas_triangle (int row) {
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            int n=1;
            for (int k=1; k<=i; k++) {
                System.out.print(n + " ");
                n = n*(i-k)/k;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pasclas_triangle(5);
    }
}

/*
     1 
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1 
*/