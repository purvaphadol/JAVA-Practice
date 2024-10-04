public class sqNo {
    static void squareNum(int row) {
        int n = row*2;
        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                int atIndex = Math.min(Math.min(i, j), Math.min(n-i, n-j)); //min method has only 2 parameters
                System.out.print(atIndex+" ");
            }
            System.out.println();
        }
    }

    static void squareNum1(int row) {
        int n = row*2;
        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                int atIndex = row - Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(atIndex+1 +" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        squareNum(4);
        System.out.println("\n");
        squareNum1(4);
    }
}

/*

1 1 1 1 1 1 1 
1 2 2 2 2 2 1
1 2 3 3 3 2 1
1 2 3 4 3 2 1
1 2 3 3 3 2 1
1 2 2 2 2 2 1
1 1 1 1 1 1 1


4 4 4 4 4 4 4
4 3 3 3 3 3 4 
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

*/