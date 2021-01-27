package com.zenkert.fb4;

public class Heltal {
    static boolean even(int n) {
        boolean j = false;
        if (n == 0) {
            j = true;
        } else {
            j = odd(n - 1);
        }
        return j;
    }

    static boolean odd(int n) {
        boolean j = false;
        if (n == 0) {
            j = false;
        } else {
            j = even(n - 1);
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(even(5));
    }
}
