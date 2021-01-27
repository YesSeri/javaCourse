package com.zenkert.fb4;

public class Meow {
    public static void meowRec(int n) {
        if (n > 0) {
            System.out.print("MEOW! ");
            meowRec((n - 1));
        }
    }

    public static void main(String[] args) {
        meowRec(100);
    }

}
