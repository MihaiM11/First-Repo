package org.example.FoodPackage;

public class Fruits extends Food {

    private double kilograms;

    public Fruits(String productName,double productPrice,double kilograms){
        super(productName,productPrice);
        this.kilograms=kilograms;
    }

    public double getKilograms() {
        return kilograms;
    }

    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }

    public static void showFruits(){
        System.out.println("We have following types of fruits:");

        String apple="Apple";
        String pear="Pear";
        String grape="Grape";
        String banana="Banana";

        double applesPrice= 3;
        double pearPrice=7;
        double grapePrice=9;
        double bananaPrice=5.5;

        System.out.println("1." + apple + " at price " + applesPrice);
        System.out.println("2." + pear + " at price " + pearPrice);
        System.out.println("3." + grape + " at price " + grapePrice);
        System.out.println("4." + banana + " at price " + bananaPrice);




    }

}
