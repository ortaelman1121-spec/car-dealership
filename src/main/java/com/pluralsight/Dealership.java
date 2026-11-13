package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        //init an empty inventory when a dealership is created
        this.inventory = new ArrayList<>();
    }

    //add vehicles to the inventory
    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);

    }

    //get all the vehicles
    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory;
    }

    private void removeVehicle(Vehicle vehicle){
        //yet to do: remove a vehicle from the in inventory in ph5
    }

    public ArrayList<Vehicle> getVehicleByPrice(BigDecimal min,BigDecimal max) {
        //loop over inventory and return a list of vehicles that match the price range

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }
}
