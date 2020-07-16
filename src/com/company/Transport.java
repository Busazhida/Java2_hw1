package com.company;

public class Transport {
    private double volume;
    private String capacity;
    private Model model;


    public Transport(double volume, String capacity, Model model){
        this.volume = volume;
        this.capacity = capacity;
        this.model = model;
    }


    public double getVolume() {
        return volume;
    }

    public Model getModel() {
        return model;
    }

    public String getCapacity() {
        return capacity;
    }

}
