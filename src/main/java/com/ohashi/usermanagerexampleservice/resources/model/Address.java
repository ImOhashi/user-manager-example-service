package com.ohashi.usermanagerexampleservice.resources.model;

import java.io.Serializable;

public class Address implements Serializable {

    public Address(String zipCode, String street, String number, String state) {
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
        this.state = state;
    }

    private String zipCode;
    private String street;
    private String number;
    private String state;
}
