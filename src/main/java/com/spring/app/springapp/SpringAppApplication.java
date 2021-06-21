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
        House house = (House) ctxt.getBean("houseBean1");
        System.out.println(house);

        System.out.println();
        System.out.println("House Disordered :");
        House house2 = (House) ctxt.getBean("houseBean2");
        System.out.println(house2);

        System.out.println();
        System.out.println("Calling Mickeal :");
        Developer mickael = (Developer) ctxt.getBean("developerBean");
        System.out.println(mickael);

        System.out.println();
        System.out.println("Calling Adam :");
        Developer adam = (Developer) ctxt.getBean("productManagerBean");
        System.out.println(adam);

        System.out.println();
        System.out.println("Boris Company :");
        Company company = (Company) ctxt.getBean("companyBean");
        System.out.println(company);

        System.out.println();
        System.out.println("Calling Singleton Service :");
        Service service = (Service) ctxt.getBean("service1");
        System.out.println(service);
        service.setMessage(service.getMessage().replace('♣','♠'));
        System.out.println("Calling Renamed Service :");
        System.out.println(service);
        System.out.println("Calling Contexted Signleton Service :");
        service = (Service) ctxt.getBean("service1");
        System.out.println(service);

        System.out.println();
        System.out.println("Calling Prototype Service :");
        Service service2 = (Service) ctxt.getBean("service2");
        System.out.println(service2);
        service2.setMessage(service2.getMessage().replace('♥','♦'));
        System.out.println("Calling Renamed Service :");
        System.out.println(service2);
        System.out.println("Calling Contexted Prototype Service :");
        service2 = (Service) ctxt.getBean("service2");
        System.out.println(service2);

        System.out.println();
        System.out.println("Calling Customer :");
        Customer cust = (Customer) ctxt.getBean("customerBean");
        System.out.println(cust);

        System.out.println();
        System.out.println("KungFu Panda :");
        Panda pow = (Panda) ctxt.getBean("pow");
        System.out.println(pow);
    }

}
