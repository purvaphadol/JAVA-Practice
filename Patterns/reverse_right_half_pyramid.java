public class reverse_right_half_pyramid {

    static void star(int row) {
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void number_increasing(int row) {
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            } 
            System.out.println();
        }
    }

    static void char_increasing(int row) {
        char ch = 'A';
        for (int i=row; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void char_increasing_line(int n) {
        for (int i=n; i>=1; i--) {
            char ch = 'A';
            for (int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    static void char_decreasing(int row) {
        char ch = (char) ('A' + row-1);
        for (char i=ch; i>='A'; i--) {
            for (char j=i; j>='A'; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    

    public static void main (String[] args) {
        star(4);
        number_increasing(5);
        char_increasing(5);
        char_increasing_line(5);
        char_decreasing(5);
    }
}

/*
* * * * 
* * *
* *
*

1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1

A B C D E
F G H I
J K L
M N
O

A B C D E
A B C D
A B C
A B
A

E D C B A
D C B A
C B A
B A
A
*/