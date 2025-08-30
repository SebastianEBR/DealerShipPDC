package org.uniquindio.edu.co.pdc.model;

import java.util.ArrayList;
import java.util.Optional;

public class Dealership {

    private String name;
    private String nit;
    private ArrayList<Vehicle> listVehicles;
    private ArrayList<Person> listPersons;

    private Dealership(Builder builder){
        this.name = builder.name;
        this.nit = builder.nit;
        this.listVehicles = new ArrayList<>();
        this.listPersons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Vehicle> getListVehicles() {
        return listVehicles;
    }

    public void setListVehicles(ArrayList<Vehicle> listVehicles) {
        this.listVehicles = listVehicles;
    }

    public ArrayList<Person> getListPersons() {
        return listPersons;
    }

    public void setListPersons(ArrayList<Person> listPersons) {
        this.listPersons = listPersons;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", nit='" + nit + '\'' +
                ", listVehicles=" + listVehicles +
                "List of persons: " + listPersons;
    }

    public static class Builder{
        private String name;
        private String nit;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder nit(String nit){
            this.nit = nit;
            return this;
        }

        public Dealership build(){
            return new Dealership(this);
        }
    }

    // CRUD to Vehicle

    //CREATE
    public Vehicle registerVehicle(String type, String plate, String brand, String model) throws Exception {
        Optional<Vehicle> vehOptional = searchVehicle(plate);
        if(vehOptional.isPresent()){
            throw new Exception("not is possible that two vehicles exits with the same plate: " + plate);
        }
        Vehicle vC = VehicleFactory.createVehicle(type, plate, brand, model);
        listVehicles.add(vC);
        return vC;
    }

    //READ
    //UPDATE
    //DELETE

    private Optional<Vehicle> searchVehicle(String plate){
        return listVehicles.stream().filter(v -> v.getPlate().equals(plate)).findFirst();
    }

    //CRUD to Persons
    public Client registerClient(String name, String id, CLevel cLevel, String shippingAddress) throws Exception{

        Optional<Person> personOptional = searchPerson(id);
        if(personOptional.isPresent()){
            throw new Exception("Not is possible that two person have the same id "+ id);
        }
        Client clientC = new Client.Builder()
                .name(name)
                .id(id)
                .cLevel(cLevel)
                .shippingAddress(shippingAddress)
                .build();
        listPersons.add(clientC);
        return clientC;
    }

    public Employee registerEmployee(String name, String id, String code, String job, double salary) throws Exception{

        Optional<Person> personOptional = searchPerson(id);
        if(personOptional.isPresent()){
            throw new Exception("Not is possible that two person have the same id "+ id);
        }
        Employee employeeC = new Employee.Builder()
                .name(name)
                .id(id)
                .code(code)
                .job(job)
                .salary(salary)
                .build();

        listPersons.add(employeeC);
        return employeeC;
    }

    private Optional<Person> searchPerson(String id){
        return listPersons.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
