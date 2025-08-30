package org.uniquindio.edu.co.pdc.model;

public abstract class Vehicle {

    protected String plate;
    protected String brand;
    protected String model;
    protected Transmission transmission;

    protected Vehicle(String plate, String brand, String model){
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", Transmission=" + transmission +
                '}';
    }

    abstract void run();
}
