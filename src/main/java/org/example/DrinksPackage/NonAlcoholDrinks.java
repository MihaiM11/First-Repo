package org.example.DrinksPackage;

public class NonAlcoholDrinks extends Drinks{
    public NonAlcoholDrinks(String drinkName,double drinkPrice){
        super(drinkName,drinkPrice);
    }
    public static void showNonAlcoholicDrinks(){
        System.out.println("We have the following kinds of non-alcoholic drinks:");

        String cola="cocacola";
        String water="dorna";
        String tea="fuzetea";
        String fanta="fanta";
        String schweppes="schweppes";


        double colaPrice=5;
        double waterPrice=3.5;
        double teaPrice=5;
        double fantaPrice=5;
        double schweppesPrice=4.5;

        System.out.println("1." + cola + " at price " + colaPrice);
        System.out.println("1." + water + " at price " + waterPrice);
        System.out.println("1." + tea + " at price " + teaPrice);
        System.out.println("1." + fanta + " at price " + fantaPrice);
        System.out.println("1." + schweppes + " at price " + schweppesPrice);
    }
}
