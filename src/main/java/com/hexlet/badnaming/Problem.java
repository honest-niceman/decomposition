package com.hexlet.badnaming;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Не заглянув в реализацию методов невозможно понять что они делают
 */
public class Problem {
    public static int c(int a, int b) {
        int x = a + b;
        return x;
    }

    public static double m(double n, double p) {
        double r = n * p;
        return r;
    }

    public static double c(int[] n) {
        double t = 0;
        for (int i = 0; i < n.length; i++) {
            t += n[i];
        }
        return t;
    }

    public static Date p(String d) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date x = null;
        try {
            x = df.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return x;
    }
}
