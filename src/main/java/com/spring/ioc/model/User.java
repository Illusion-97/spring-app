package com.spring.ioc.model;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private double amount;

    public User() {
    }

    public User(String firstName, double amount) {
        this.firstName = firstName;
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
