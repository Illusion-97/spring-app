package com.spring.ioc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("houseBean1")
public class House {

    @Value("Euratechnologies, Lille 59000")
    private String address;
    @Value("30")
    private int nbWindow;
    @Value("14")
    private int nbDoor;
    @Value("Myrthille")
    private String owner;

    public House() {
    }

    public House(String address, int nbWindow, int nbDoor, String owner) {
        this.address = address;
        this.nbWindow = nbWindow;
        this.nbDoor = nbDoor;
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNbWindow() {
        return nbWindow;
    }

    public void setNbWindow(int nbWindow) {
        this.nbWindow = nbWindow;
    }

    public int getNbDoor() {
        return nbDoor;
    }

    public void setNbDoor(int nbDoor) {
        this.nbDoor = nbDoor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", nbWindow=" + nbWindow +
                ", nbDoor=" + nbDoor +
                ", owner='" + owner + '\'' +
                '}';
    }
}

