package com.zenkert.fb3;

public class Helicopter {
    private String callSign = "";
    private long rtX = 0L, rtY = 0L;
    private double distanceFlown = 0.0d;

    public Helicopter(String name) {
        callSign = name;
    }

    public void flyTo(long x, long y) {
        double dx = Math.abs(x - rtX);
        double dy = Math.abs(y - rtY);
        distanceFlown += Math.sqrt(dx * dx + dy * dy);
        rtX = x;
        rtY = y;
    }

    public String callSign() {
        return callSign;
    }

    public long getX() {
        return rtX;
    }

    public long getY() {
        return rtY;
    }

    public double distanceFlown() {
        return distanceFlown;
    }

    static double seperation(Helicopter h1, Helicopter h2) {
        double dx = h1.getX() - h2.getX();
        double dy = h1.getY() - h2.getY();

        System.out.println(dx);
        double distanceBetween = Math.sqrt(dx * dx + dy * dy);

        return distanceBetween;
    }
}