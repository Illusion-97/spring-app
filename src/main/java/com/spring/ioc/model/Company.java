package com.spring.ioc.model;

public class Company {
    private  String name;
    private Developer projectManager;
    private Developer devJava;

    public Company() {
        System.out.println("Company Builded");
    }

    public Company(String name, Developer CP, Developer dev) {
        this.name = name;
        this.projectManager = CP;
        this.devJava = dev;
        System.out.println("Company Builded");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name Updated");
    }

    public Developer getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(Developer projectManager) {
        this.projectManager = projectManager;
        System.out.println("ProjectManager Updated");
    }

    public Developer getDevJava() {
        return devJava;
    }

    public void setDevJava(Developer devJava) {
        this.devJava = devJava;
        System.out.println("DevJava Updated");
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", CP=" + projectManager +
                ", dev=" + devJava +
                '}';
    }
}
