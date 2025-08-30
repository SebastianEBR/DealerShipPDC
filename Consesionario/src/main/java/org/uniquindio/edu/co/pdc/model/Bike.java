package org.uniquindio.edu.co.pdc.model;

public class Bike extends Vehicle{
    private boolean hasAirbags;

    public Bike(String plate, String brand, String model){
        super(plate, brand, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                ", hasAirbags=" + hasAirbags +
                '}';
    }

    @Override
    public void run(){
        System.out.println("Bike is starting end ready to run, but put your helmet");
    }
}

