package com.ohashi.usermanagerexampleservice.resources.model;

import com.ohashi.usermanagerexampleservice.resources.model.enums.UserType;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("user")
public class UserDocument implements Serializable {

    @Id
    private ObjectId _id;

    private String name;
    private String surname;
    private String description;
    private UserType userType;
    private Address address;
}
