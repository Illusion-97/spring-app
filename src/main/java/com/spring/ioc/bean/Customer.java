package com.spring.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

@Service
@Configurable
public class Customer {
    private String action;
    private int type;
    @Autowired
    private Person person;

    public Customer() {
    }

    public Customer(String action, int type, Person person) {
        this.action = action;
        this.type = type;
        this.person = person;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "action='" + action + '\'' +
                ", type=" + type +
                ", person=" + person +
                '}';
    }
}
