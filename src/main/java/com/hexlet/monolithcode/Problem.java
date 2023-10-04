package com.hexlet.monolithcode;

public class Problem {
    public static double calculateTotalSalaryForActiveUsers(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee.getStatus().equals("active")) {
                switch (employee.getPosition()) {
                    case "manager" -> totalSalary += employee.getSalary() + (employee.getSalary() * 0.1);
                    case "developer" -> totalSalary += employee.getSalary() + (employee.getSalary() * 0.05);
                    case "designer" -> totalSalary += employee.getSalary() + (employee.getSalary() * 0.03);
                }
            }
        }
        return totalSalary;
    }
}
