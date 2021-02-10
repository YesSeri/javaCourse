package com.zenkert.fb4;

public class FourAMax {
    static int maxIf(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    static int maxTern(int a, int b) {
        return a < b ? a : b;
    }

    public static int maxArr(int[] a) {
        int max = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i]> max){
                max = a[i];
            }
        }
        return max;
    }
    private static int max(int[] a, int idx){
        if (idx == a.length -1 ){
            return a[idx];
        } else{
            return maxTern(a[idx], max(a, idx+1));
        }

    }
    private static int sum(int[] a, int idx) {
        if (a.length == 0) {
            return 0;
        } else if (a.length - 1 == idx) {
            return a[idx];
        }
        return a[idx] + sum(a, idx + 1);
    }
    private static int product(int[] a, int idx) {
        if (a.length == 0) {
            return 1;
        } else if (a.length - 1 == idx) {
            return a[idx];
        }
        return a[idx] * product(a, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 3, 2, 9};
        System.out.println(max(arr, 0));
    }
}
