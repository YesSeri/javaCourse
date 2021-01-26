package com.zenkert.fb3;

public class Helikopterflykt {
    public static void main(String args[]){
        Helicopter helicopter = new Helicopter("176");
        Helicopter polishelikopter = new Helicopter("Carlsson");

        helicopter.flyTo(30,30);
        polishelikopter.flyTo(-30,-30);

        System.out.println(Helicopter.seperation(helicopter, polishelikopter));
    }

}
