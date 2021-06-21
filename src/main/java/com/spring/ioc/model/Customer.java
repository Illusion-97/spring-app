package com.spring.ioc.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private Address firstAddress;

    public Customer() {
    }

    public Customer(String name, Address firstAddress) {
        this.name = name;
        this.firstAddress = firstAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getFirstAddress() {
        return firstAddress;
    }

    public void setFirstAddress(Address firstAddress) {
        this.firstAddress = firstAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", firstAddress=" + firstAddress +
                '}';
    }
}
