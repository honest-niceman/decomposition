package com.hexlet.badnaming;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static int add(int operand1, int operand2) {
        int sum = operand1 + operand2;
        return sum;
    }

    public static double multiply(double factor1, double factor2) {
        double product = factor1 * factor2;
        return product;
    }

    public static double calculateSum(int[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }

    public static Date parseDate(String dateString) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = null;
        try {
            parsedDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsedDate;
    }
}
