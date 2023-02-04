package org.examples.springboot.model;

public class Employee {

    private Integer id;

    private String name;

    private String age;

    private String destination;

    public Employee(Integer id, String name, String age, String destination) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.destination = destination;
    }

    public void setId(Integer id)  {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
