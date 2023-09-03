package com.ohashi.usermanagerexampleservice.resources.model;

import com.ohashi.usermanagerexampleservice.resources.model.enums.UserType;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("user")
public class UserDocument implements Serializable {

    @PersistenceCreator
    public UserDocument(ObjectId _id, String name, String surname, String email, String description, UserType userType, Address address) {
        this._id = _id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.description = description;
        this.type = userType;
        this.address = address;
    }

    private UserDocument(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.description = builder.description;
        this.type = builder.type;
        this.address = builder.address;
    }

    @Id
    private ObjectId _id;

    private String name;
    private String surname;

    @Indexed
    private String email;
    private String description;
    private UserType type;
    private Address address;

    public static class Builder {

        private String name;
        private String surname;
        private String email;
        private String description;
        private UserType type;
        private Address address;

        public UserDocument build() {
            return new UserDocument(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setType(UserType type) {
            this.type = type;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }
    }
}
