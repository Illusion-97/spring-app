package com.spring.ioc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kungFu")
public class KungFu {
    @Value(("Dragon Blow"))
    private String name;

    public KungFu(String name) {
        this.name = name;
    }

    public KungFu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KungFu{" +
                "name='" + name + '\'' +
                '}';
    }
}
