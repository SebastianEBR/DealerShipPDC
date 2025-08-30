package org.uniquindio.edu.co.pdc.model;

public class VehicleFactory {

    public static Vehicle createVehicle(String type, String plate, String brand, String model){
        switch (type.toUpperCase()){
            case "CAR":
                return new Car(plate, brand, model);
            case "BIKE":
                return new Bike(plate, brand, model);
            default:
                throw new IllegalArgumentException("The type: " + type + " is not valid");
        }
    }
}
