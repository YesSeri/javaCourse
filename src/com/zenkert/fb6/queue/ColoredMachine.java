package com.zenkert.fb6.queue;

public class ColoredMachine extends Machine{
    String color;
    ColoredMachine auto;
    public ColoredMachine(String color){
        this.color = color;
        auto = this;
    }

    public String getColor() {
        return color;
    }
    // Svaret borde bli 10.
}
