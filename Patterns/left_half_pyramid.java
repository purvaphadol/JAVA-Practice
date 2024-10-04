public class left_half_pyramid {
    static void stars(int row) {
        for (int i=1; i<=row; i++) {
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
        for (int i=1; i<=row; i++) {
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
        for (int i=1; i<=row; i++) {
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

     static void char_increase_line(int row) {
        for (int i=1; i<=row; i++) {
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

    public static void main(String[] args) {
        stars(4);
        numbers(5);
        char_increase(5);
        char_increase_line(5);
    }
}

/*
   *
  **
 ***
****

    1
   12
  123
 1234
12345

    A
   BC
  DEF
 GHIJ
KLMNO

    A
   AB
  ABC
 ABCD
ABCDE
*/