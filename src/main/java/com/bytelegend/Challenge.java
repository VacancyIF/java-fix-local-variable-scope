package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(relation(1, 2));
        System.out.println(relation(2, 1));
        System.out.println(relation(2, 2));
    }

    // Fix the compilation error
    // Return "a<b" if a < b, "a>b" if a > b, "a=b" otherwise
    public static String relation(int a, int b) {
        String sign = "";
        String aa = "" + a;
        String bb = "" + b;
        if (a > b) {
            sign = ">";
        } else if (a < b) {
            sign = "<";
        } else {
            sign = "=";
        }

        return aa + sign + bb;
    }
}
