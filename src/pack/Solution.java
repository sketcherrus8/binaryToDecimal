package pack;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) return "";
        String b = "";
        while (decimalNumber != 0) {
            b = (decimalNumber % 2) + b;
            decimalNumber /= 2;
        }
        return b;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == "" | binaryNumber == null) return 0;
        int d = 0;
        String[] arStr = binaryNumber.split("");
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (arStr[binaryNumber.length() - 1 - i].equals("1")) {
                d = d + (int) Math.pow(2, i);
            }
        }
        return d;
    }

}
