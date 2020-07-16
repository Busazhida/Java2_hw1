package com.company;

import java.sql.DataTruncation;

public class Car extends Transport {
    private int wheel;
    private Colors color;
    private int year;
    private String name;

    public Car(String name, double volume, String capacity, Model model, int wheel, Colors color, int year) {
        super(volume, capacity, model);
        this.name = name;
        this.wheel = wheel;
        this.color = color;
        this.year = year;
    }

    public int getWheel() {
        return wheel;
    }

    public Colors getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void printSound(int num, String sound) {
        for (int i = 0; i < num; i++) {
            System.out.println(sound);
        }
    }

    public final void printSound(String sound, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(sound);

        }
    }

    public void printSound(String sound) {
        System.out.println(sound);
    }

    public String printInfo() {
        return "_______________________________________________________"
                +"\nName - " + getName()
                + "\n Wheel's amount - " + getWheel()
                + "\n Color -" + getColor()
                + "\n Year - " + getYear();
    }
}
