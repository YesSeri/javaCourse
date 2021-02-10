package com.zenkert.fb4.Katt;

public class FourBMeow {
    public static void meowRec(int n) {
        if (n > 0) {
            System.out.print("MEOW! ");
            meowRec((n - 1));
        }
    }
}
