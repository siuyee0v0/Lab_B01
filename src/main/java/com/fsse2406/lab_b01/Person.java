package com.fsse2406.lab_b01;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    @JsonProperty("last_name")
    private String firstName;
    @JsonProperty("first_name")
    private String lastName;
    @JsonProperty("hkid_number")
    private String hkid;

    public Person(String hkid, String lastName, String firstName) {
        this.hkid = hkid;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHkid() {
        return hkid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
