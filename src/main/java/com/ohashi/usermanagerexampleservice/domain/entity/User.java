package com.ohashi.usermanagerexampleservice.domain.entity;

import com.ohashi.usermanagerexampleservice.resources.model.Address;
import com.ohashi.usermanagerexampleservice.resources.model.enums.UserType;

public class User {

    public User(String name, String surname, String email, String description, UserType type, Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.description = description;
        this.type = type;
        this.address = address;
    }

    private String name;
    private String surname;
    private String email;
    private String description;
    private UserType type;
    private Address address;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDescription() {
        return description;
    }

    public UserType getType() {
        return type;
    }

    public Address getAddress() {
        return address;
    }
}
