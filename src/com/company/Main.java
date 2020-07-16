package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", 2.6, "Light car", new Model("Toyota studio", "Ipsum"), 4, Colors.YELLOW, 2010);
        car.printSound(2, "Annnnn");
        car.printSound("Annnnnn", 4);
        car.printSound("Annnnn");
        System.out.println(car.printInfo());

        Bike bike = new Bike("Suzuki", 1.4, "Easy", new Model("Suzuki.kg", "Groza"), 2, Colors.BLACK, 2018, "super high");
        System.out.println(bike.printInfo());

        Bike bike2 = new Bike("BMW", 1.9, "Sport moto", new Model("BMW.kg", "Strela"), 2, Colors.RED, 2020, "super mega high");
        System.out.println(bike2.printInfo());
    }

}
