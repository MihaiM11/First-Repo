package org.example.FoodPackage;

public class FoodProducts extends Food{
    private double quantity;

    public FoodProducts(String productName, double productPrice, double quantity){
        super(productName,productPrice);
        this.quantity=quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public static void showProducts(){
        System.out.println("We have following product foods:");

        String bread= "bread";
        String chips="chips";
        String croissant="croissant";
        String cookies="cookies";

        double breadPrice=5;
        double chipsPrice=9;
        double croissantPrice=4.5;
        double cookiesPrice=3.5;

        System.out.println("1." + bread + " at price " + breadPrice);
        System.out.println("2." + chips + " at price " + chipsPrice);
        System.out.println("3." + croissant + " at price " + croissantPrice);
        System.out.println("4." + cookies + " at price " + cookiesPrice);
    }



}
