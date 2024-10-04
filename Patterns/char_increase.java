public class char_increase {
    public static void charincreasing(int n) {
        char ch = 'A';
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void char_increasing(int n) {
        for (int i=1; i<=n; i++) {
            char ch = 'A';
            for (int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void printPattern1(int rows) {
        char startChar = (char) ('A' + rows - 1); // Start with 'E' for 5 rows, 'D' for 4, etc.
        for (char i = startChar; i >= 'A'; i--) {
            for (char j = i; j <= startChar; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int rows) {
        char letter = 'a'; // Start with 'a'
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Alternate case: Uppercase if position is even, lowercase if odd
                if ((i+j) % 2 == 0) {
                    System.out.print(Character.toLowerCase(letter) + " ");
                } else {
                    System.out.print(Character.toUpperCase(letter) + " ");
                }
                letter++; // Move to the next letter
            }
            System.out.println();
        }
    }

    public static void printPattern3(int rows) {
        char letter = 'a'; // Start with 'a'
        boolean isUpper = false; // Track if the next character should be uppercase

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (isUpper) {
                    System.out.print(Character.toUpperCase(letter) + " ");
                } else {
                    System.out.print(Character.toLowerCase(letter) + " ");
                }
                letter++; // Move to the next letter
                isUpper = !isUpper; // Toggle case for the next character
            }
            System.out.println(); // New line after each row
        }
    }

    public static void main (String[] args) 
    {
        charincreasing(4);
        char_increasing(5);
        printPattern1(5);
        printPattern2(5);
        printPattern3(5);
    }
}
/*
A 
B C
D E F
G H I J

A
A B
A B C
A B C D
A B C D E

E
D E
C D E
B C D E
A B C D E

a
B c
d E f
G h I j
k L m N o

a
B c
D e F
g H i J
k L m N o
*/