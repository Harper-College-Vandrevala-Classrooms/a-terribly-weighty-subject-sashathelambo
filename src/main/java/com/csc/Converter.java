package com.csc;

public class Converter {

    public String toPounds(int ounces) {
        double pounds = ounces / 16.0; 
        String result = String.format("%.4f", pounds);
        if (pounds == 1.0) {
            return result + " lb"; 
        } else {
            return result + " lbs"; 
        }
    }

    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        if (pounds == 1) {
            return pounds + " lb " + remainingOunces + " oz";
        } else {
            return pounds + " lbs " + remainingOunces + " oz";
        }
    }

    public static void main(String[] args) {
        Converter converter = new Converter();

        // Test the toPounds method
        int ounces1 = 32;
        System.out.println(ounces1 + " ounces is " + converter.toPounds(ounces1));

        // Test the toPoundsAndOunces method
        int ounces2 = 45;
        System.out.println(ounces2 + " ounces is " + converter.toPoundsAndOunces(ounces2));
    }
}
