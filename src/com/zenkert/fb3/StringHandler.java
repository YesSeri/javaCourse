package com.zenkert.fb3;

public class StringHandler {
    public static String beautify(String s, char bad) {
        String newS = "";
        System.out.println(s + " " + bad);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != bad) {
                System.out.println(s.charAt(i));
                newS += s.charAt(i);
            }
        }
        return newS;
    }

    public static String beautifyRec(String s, char bad) {
        return "a";
    }
}
