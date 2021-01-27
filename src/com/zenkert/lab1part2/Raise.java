package com.zenkert.lab1part2;

public class Raise {
    static int recHalfCounter = 0;
    static int recOneCounter = 0;
    public static double recRaiseOne(double x, int k) {
        if (k == 0) {
            return 1.0;
        } else {
            recOneCounter++;
            return x * recRaiseOne(x, k - 1);
        }
    }

    public static double recRaiseHalf(double x, int k) {
        int y = k / 2;
        if (k == 0) { 
        	return 1;
        }
        recHalfCounter++;
        // Dividing an int by an int floors the value automatically.
        if (k % 2 == 0) {
            double z = recRaiseHalf(x, y);
        	return z * z;
        }
        double z = recRaiseHalf(x, y);
        return x * z * z;
    }
    public static void runBoth(double x, int k) {
      Raise.recRaiseHalf(x, k);
      Raise.recRaiseOne(x, k);
    }
}
