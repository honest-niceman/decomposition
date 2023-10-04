package com.hexlet.monolithcode;

public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private String status;
    private String position;

    public Employee(String firstName, String lastName, Double salary, String status, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.status = status;
        this.position = position;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
