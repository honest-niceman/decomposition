package com.hexlet.monolithcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    private static final String MANAGER = "manager";
    private static final String DEVELOPER = "developer";
    private static final String DESIGNER = "designer";

    private static final String ACTIVE_STATUS = "active";

    private static final double TEN_PERCENTS = 0.1;
    private static final double FIVE_PERCENTS = 0.05;
    private static final double THREE_PERCENTS = 0.03;
    private static final double ONE_PERCENT = 0.01;

    public static double calculateTotalSalaryForActiveUsers(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee.getStatus().equals(ACTIVE_STATUS)) {
                totalSalary += getTotalSalaryWithBonus(employee);
            }
        }
        return totalSalary;
    }

    private static double getTotalSalaryWithBonus(Employee employee) {
        double totalSalary = 0;
        switch (employee.getPosition()) {
            case MANAGER -> totalSalary += employee.getSalary() + (employee.getSalary() * TEN_PERCENTS);
            case DEVELOPER -> totalSalary += employee.getSalary() + (employee.getSalary() * FIVE_PERCENTS);
            case DESIGNER -> totalSalary += employee.getSalary() + (employee.getSalary() * THREE_PERCENTS);
            default -> totalSalary += employee.getSalary() + (employee.getSalary() * ONE_PERCENT);
        }
        return totalSalary;
    }
}
