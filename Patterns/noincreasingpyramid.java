public class noincreasingpyramid
{
    public static void noincreasing (int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void noincreasingrowwise (int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void no_change(int n) {
        int num=0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main (String[] args) 
    {
        noincreasing(5);
        noincreasingrowwise(4);
        no_change(4);
    }
}
/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5

1
2 2
3 3 3
4 4 4 4

0
1 2
3 4 5
6 7 8 9
*/
