package com.spring.ioc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component("firstAddress")
public class Address implements Serializable {
    @Value("Gare Lille Flandres 59000, Batiment A, Etage 4")
    private String fullAddress;

    public Address() {
    }

    public Address(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "fullAddress='" + fullAddress + '\'' +
                '}';
    }
}
