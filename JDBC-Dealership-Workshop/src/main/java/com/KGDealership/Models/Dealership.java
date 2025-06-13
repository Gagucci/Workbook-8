package com.KGDealership.Models;

public class Dealership {

    private int dealership_id;
    private String dealership_name;
    private String dealership_address;
    private String dealership_phone;

    public Dealership(int dealership_id, String dealership_name, String dealership_address, String dealership_phone) {
        this.dealership_id = dealership_id;
        this.dealership_name = dealership_name;
        this.dealership_address = dealership_address;
        this.dealership_phone = dealership_phone;
    }

    public int getDealership_id() {
        return dealership_id;
    }

    public String getDealership_name() {
        return dealership_name;
    }

    public String getDealership_address() {
        return dealership_address;
    }

    public String getDealership_phone() {
        return dealership_phone;
    }

    public void setDealership_id(int dealership_id) {
        this.dealership_id = dealership_id;
    }

    public void setDealership_name(String dealership_name) {
        this.dealership_name = dealership_name;
    }

    public void setDealership_address(String dealership_address) {
        this.dealership_address = dealership_address;
    }

    public void setDealership_phone(String dealership_phone) {
        this.dealership_phone = dealership_phone;
    }

}

