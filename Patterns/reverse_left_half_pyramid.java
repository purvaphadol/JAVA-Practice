public class reverse_left_half_pyramid {
    static void stars(int row) {
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void numbers(int row) {
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void char_increase(int row) {
        char ch = 'A';
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }

     static void char_increase_line(int row) {
        for (int i=row; i>=1; i--) {
            char ch='A';
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    static void zero_one_trianle(int row) {
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                if ((i+j)%2 ==0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    static void zero_one(int row) {
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                if ((j%2) ==0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stars(4);
        numbers(5);
        char_increase(5);
        char_increase_line(5);
        zero_one_trianle(4);
        zero_one(4);
    }
}

/*

****
 ***
  **
   *

12345
 1234
  123
   12
    1

A B C D E 
  F G H I
    J K L
      M N
        O

ABCDE
 ABCD
  ABC
   AB
    A

1010
 010
  10
   0

1010
 101
  10
   1

*/