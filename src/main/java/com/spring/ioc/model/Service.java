package com.spring.ioc.model;

public class Service {
    private String message;

    public Service(String message) {
        this.message = message;
    }

    public Service() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Service{" +
                "message='" + message + '\'' +
                '}';
    }
}
