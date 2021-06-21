package com.spring.ioc.model;

public class Developer {
    private String name;
    private int nbSkillYear;

    public Developer() {
        System.out.println("Dev Builded");
    }

    public Developer(String name, int nbSkillYear) {
        this.name = name;
        this.nbSkillYear = nbSkillYear;
        System.out.println("Dev Builded");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name Updated");
    }

    public int getNbSkillYear() {
        return nbSkillYear;
    }

    public void setNbSkillYear(int nbSkillYear) {
        this.nbSkillYear = nbSkillYear;
        System.out.println("NbSkillyear Updated");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", nbSkillYear=" + nbSkillYear +
                '}';
    }
}
