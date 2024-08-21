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
}