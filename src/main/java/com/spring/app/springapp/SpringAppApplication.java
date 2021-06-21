package com.spring.app.springapp;

import com.spring.ioc.model.Company;
import com.spring.ioc.model.House;
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

        System.out.println("House Ordered :");
        House house = (House) ctxt.getBean("houseBean1");
        System.out.println(house);

        System.out.println("House Disordered :");
        House house2 = (House) ctxt.getBean("houseBean2");
        System.out.println(house2);

        System.out.println("Boris Company :");
        Company company = (Company) ctxt.getBean("companyBean");
        System.out.println(company);
    }

}
