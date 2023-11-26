package org.hem.spring.core;

public class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
/*
* Cntl+alt+l  -> format the code
alt+fun+insert   -> to generate getter and setter
cntl+alt+V    -> Assign a local variable to the class name
* */