package com.zenkert.fb5.trafik;

public class Bildäck {
    String tillverkare;
    int bredd;
    int höjd;
    int fälgdiameter;
    boolean punkterat = false;

    public Bildäck(String tillverkare, int bredd, int höjd, int fälgdiameter) {
        this.tillverkare = tillverkare;
        this.bredd = bredd;
        this.höjd = höjd;
        this.fälgdiameter = fälgdiameter;
    }

    public void setPunkterat(boolean punkterat) {
        this.punkterat = punkterat;
    }

    public String toString() {
        return bredd + "/" + höjd + " R " + fälgdiameter;
    }
    public static void main(String[] args){
        Bildäck d = new Bildäck("Michelin", 195, 65, 15);
        System.out.println(d.toString());
    }

}
