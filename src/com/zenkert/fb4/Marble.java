package com.zenkert.fb4;

public class Marble {
    private double radius;
    private double x;
    private double y;
    private double z;

    public Marble(double radius, double x, double y, double z) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean collides(Marble s1, Marble s2) {
        double midDistance = distanceBetweenMiddle(s1, s2);
        boolean isColliding = midDistance - s1.radius - s2.radius <= 0;
        return isColliding;
    }

    private static double distanceBetweenMiddle(Marble s1, Marble s2) {
        double dx = s1.getX() - s2.getX();
        double dy = s1.getY() - s2.getY();
        double dz = s1.getZ() - s2.getZ();
        System.out.println(dx + " " + dy + " " + dz + " ");
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
