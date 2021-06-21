package com.spring.app.springapp;

import com.spring.ioc.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringAppApplication.class, args);
        ApplicationContext ctxt =
                new ClassPathXmlApplicationContext("spring-bean.xml");

        System.out.println();
        System.out.println("House Ordered :");
        System.out.println(ctxt.getBean("houseBean1"));

        System.out.println();
        System.out.println("House Disordered :");
        System.out.println(ctxt.getBean("houseBean2"));

        System.out.println();
        System.out.println("Calling Mickeal :");
        System.out.println(ctxt.getBean("developerBean"));

        System.out.println();
        System.out.println("Calling Adam :");
        System.out.println(ctxt.getBean("productManagerBean"));

        System.out.println();
        System.out.println("Boris Company :");
        System.out.println(ctxt.getBean("companyBean"));

        System.out.println();
        System.out.println("Calling Singleton Service :");
        Service service = (Service) ctxt.getBean("service1");
        System.out.println(service);
        service.setMessage(service.getMessage().replace('♣','♠'));
        System.out.println("Calling Renamed Service :");
        System.out.println(service);
        System.out.println("Calling Contexted Signleton Service :");
        System.out.println(ctxt.getBean("service1"));

        System.out.println();
        System.out.println("Calling Prototype Service :");
        Service service2 = (Service) ctxt.getBean("service2");
        System.out.println(service2);
        service2.setMessage(service2.getMessage().replace('♥','♦'));
        System.out.println("Calling Renamed Service :");
        System.out.println(service2);
        System.out.println("Calling Contexted Prototype Service :");
        System.out.println(ctxt.getBean("service2"));

        System.out.println();
        System.out.println("Calling Customer :");
        System.out.println(ctxt.getBean("customerBean"));

        System.out.println();
        System.out.println("KungFu Panda :");
        System.out.println(ctxt.getBean("pow"));

        System.out.println();
        System.out.println("Calling Annother Customer :");
        System.out.println(ctxt.getBean("custom"));
    }

}
