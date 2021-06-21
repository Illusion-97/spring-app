package com.spring.ioc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("service2")
@Scope("prototype")
public class Service {
    @Value("♥ I'm a Service ♥")
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
