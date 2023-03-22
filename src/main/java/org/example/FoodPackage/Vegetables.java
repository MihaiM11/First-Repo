package org.example.FoodPackage;

import java.util.Scanner;

public class Vegetables extends Food {

    private double kilograms;

    public Vegetables(String productName, double productPrice, double kilograms) {
        super(productName, productPrice);
        this.kilograms = kilograms;
    }

    public double getKilograms() {
        return kilograms;
    }

    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }

    public static void showVegetables() {

        System.out.println("We have the following types of vegetables ");
        String potatoes = "potatoes";
        String cucumber = "cucumbers";
        String onion = "onion";
        String pepper = "peppers";

        double potatoesPrice = 3.2;
        double cucumberPrice = 6;
        double onionPrice = 3;
        double pepperPrice = 9.7;

        System.out.println("1." + potatoes + " at price " + potatoesPrice);
        System.out.println("2." + cucumber + " at price " + cucumberPrice);
        System.out.println("3." + onion + " at price " + onionPrice);
        System.out.println("4." + pepper + " at price" + pepperPrice);


    }


}
