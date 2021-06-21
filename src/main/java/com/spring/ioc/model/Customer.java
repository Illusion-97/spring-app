package com.spring.ioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component("customerBean")
public class Customer implements Serializable {
    @Value("Agence de Formation")
    private String name;
    @Autowired
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
