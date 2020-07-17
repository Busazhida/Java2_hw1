package com.company;

public final class Bike extends Car {
    private String speed;

    public Bike(String name, double volume, String capacity, Model model, int wheel, Colors color, int year, String speed) {
        super(name, volume, capacity, model, wheel, color, year);
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    @Override
    public void printSound(int num, String sound) {
        super.printSound(num, sound);
    }

    @Override
    public String printInfo() {
        return super.printInfo()
                + "\n Speed - " + getSpeed();
    }
}
