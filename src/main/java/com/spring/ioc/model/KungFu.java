package com.spring.ioc.model;

public class KungFu {
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
