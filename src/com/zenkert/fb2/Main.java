package com.zenkert.fb2;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(11));
    }

    public static int kvadratRekursiv(int k) {
        if (k == 0) {
            return k;
        }
        return (kvadratRekursiv(k - 1) + 2 * (k - 1) + 1);
    }

    public static int sifferSumma(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
