package com.Vlad;

public class Main {

    public static void main(String[] args) {
        numberToWords(9876540);
    }
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        }
        int rnum = reverse(num);
        int rnumCount = getDigitCount(rnum);
        int numCount = getDigitCount(num);
        if (rnum == 0) {
            System.out.print("Zero ");
        }
        System.out.print("Your number is: ");
        while (rnum > 0) {
            int x = rnum % 10;
            rnum /= 10;
            switch (x) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
                default -> System.out.print("Not a number ");
            }
        }
        int zerosNum = numCount - rnumCount;
        while (zerosNum > 0) {
            System.out.print("Zero ");
            zerosNum --;
        }
    }

    public static int reverse(int a) {
        int b = Math.abs(a);
        int r = 0;
        while (b > 0) {
            r = (r*10) + (b%10);
            b /= 10;
        }
        if (a < 0) {
            r *= -1;
        }
        return r;
    }

    public static int getDigitCount(int x) {
        if (x < 0) {
            return -1;
        }
        int count = 1;
        while (x > 9){
            count ++;
            x /= 10;
        }
        return count;
    }
}
