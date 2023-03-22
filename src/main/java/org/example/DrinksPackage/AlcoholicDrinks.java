package org.example.DrinksPackage;

public class AlcoholicDrinks extends Drinks{

    public AlcoholicDrinks (String drinkName,double drinkPrice){
        super(drinkName,drinkPrice);
    }

    public static void showAlcoholicDrinks(){
        System.out.println("We have following types of drinks:");

        String whisky= "whisky";
        String aperol= "aperol";
        String tequila="tequila";
        String beer="beer";

        double whiskyPrice=125;
        double aperolPrice=85.9;
        double tequilaPrice=120;
        double beerPrice=8;

        System.out.println("1." + whisky + " at price " + whiskyPrice);
        System.out.println("2." + aperol + " at price " + aperolPrice);
        System.out.println("3." + tequila + " at price " + tequilaPrice);
        System.out.println("4." + beer + " at price " + beerPrice);




    }

}
