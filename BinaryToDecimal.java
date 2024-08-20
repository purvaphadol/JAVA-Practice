import java.util.*;

public class BinaryToDecimal {

    public static int binary_to_decimal(int binNum) {
        int decNum=0;
        int pow=0;
        while (binNum > 0) {
            int lastdigit= binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2,pow));
            binNum /= 10;
            pow++;
        }
        return decNum;
    }

    public static int decimal_to_binary(int decNum) {
        int binNum=0;
        int pow=0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10,pow));
            decNum /= 2;
            pow++;
        }
        return binNum;
    }

    public static void main(String[] args) {
        System.out.println(binary_to_decimal(111));
        System.out.println(decimal_to_binary(12));

    }
}