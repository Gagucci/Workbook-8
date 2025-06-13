package com.KGDealership.Models;

public class Vehicle {
    private int vehicle_VIN;
    private int vehicle_ID;
    private int year;
    private String make;
    private String model;
    private String vehicle_type;
    private int odometer;
    private double price;
    private boolean is_sold;

    public Vehicle(int vehicle_VIN, int vehicle_ID, int year, String make, String model, String vehicle_type, int odometer, double price, boolean is_sold) {
        this.vehicle_VIN = vehicle_VIN;
        this.vehicle_ID = vehicle_ID;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicle_type = vehicle_type;
        this.odometer = odometer;
        this.price = price;
        this.is_sold = is_sold;
    }

    public int getVehicle_VIN() {
        return vehicle_VIN;
    }

    public int getVehicle_ID() {
        return vehicle_ID;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public int getOdometer() {
        return odometer;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIs_sold() {
        return is_sold;
    }

    public void setVehicle_VIN(int vehicle_VIN) {
        this.vehicle_VIN = vehicle_VIN;
    }

    public void setVehicle_ID(int vehicle_ID) {
        this.vehicle_ID = vehicle_ID;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIs_sold(boolean is_sold) {
        this.is_sold = is_sold;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle_VIN=" + vehicle_VIN +
                ", vehicle_ID=" + vehicle_ID +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vehicle_type='" + vehicle_type + '\'' +
                ", odometer=" + odometer +
                ", price=" + price +
                ", is_sold=" + is_sold +
                '}';
    }
}
