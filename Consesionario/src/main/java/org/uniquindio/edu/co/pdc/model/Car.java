package org.uniquindio.edu.co.pdc.model;

public class Car extends Vehicle{

    private boolean hasAirbags;

    public Car(String plate, String brand, String model){
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
        System.out.println("Car is starting end ready to run");
    }
}
