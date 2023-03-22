package org.example.DrinksPackage;

import java.util.Scanner;

public class Drinks {
    private String drinkName;
    private double drinkPrice;

    public Drinks(String drinkName, double drinkPrice){
        this.drinkName=drinkName;
        this.drinkPrice=drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public static void showDrinks(){
        Scanner sc= new Scanner(System.in);
        System.out.println("We have two kind of drinks :" +
                "\n 1.Non-alcoholic drinks" +
                "\n 2.Alcoholic drinks" +
                "\nPlease insert your option:");
        int option=Integer.parseInt(sc.nextLine());
        switch (option){
            case 1:
                NonAlcoholDrinks.showNonAlcoholicDrinks();
                System.out.println("Please tap your option :");
                String drinkName=sc.nextLine().toLowerCase();

             double drinkPrice=0;
             if (drinkName.equals("cocacola")){
                 drinkPrice=5;
             }else if (drinkName.equals("dorna")){
                 drinkPrice=3.5;
             }else if (drinkName.equals("fuzetea")){
                 drinkPrice=5;
             }else if (drinkName.equals("fanta")){
                 drinkPrice=5;
             }else if (drinkName.equals("schweppes")){
                 drinkPrice=4.5;
             }else {
                 System.out.println("We dont have this product in this moment , try later !");
             }
             // insert while

                System.out.println("Insert the quantity:");

                NonAlcoholDrinks nonAlcoholDrinks= new NonAlcoholDrinks(drinkName,drinkPrice);

                try {
                    int drinkQuantity=Integer.parseInt(sc.nextLine());
                    nonAlcoholDrinks.finalPrice(drinkQuantity,drinkPrice);


                }catch (NumberFormatException e){
                    System.out.println("The quantity entered is not accepted for this product");
                    System.out.println("Please insert an integer");


                }
                break;
            case 2:
                AlcoholicDrinks.showAlcoholicDrinks();
                System.out.println("Plese enter the drink you want to buy:");
                String drinkAName= sc.nextLine().toLowerCase();

                double drinkAPrice=0;
                if(drinkAName.equals("whisky")){
                    drinkAPrice=125;
                }else if (drinkAName.equals("aperol")){
                    drinkAPrice=85.9;
                }else if (drinkAName.equals("tequila")){
                    drinkAPrice=120;
                }else if(drinkAName.equals("beer")){
                    drinkAPrice=8;
                }else {
                    System.out.println("We dont have the product in this moment , try later ");
                }
                     AlcoholicDrinks alcoholicDrinks= new AlcoholicDrinks(drinkAName,drinkAPrice);
                try {
                    System.out.println("Insert the quantity:");
                    int drinkAQuantity = Integer.parseInt(sc.nextLine());
                    alcoholicDrinks.finalPrice(drinkAQuantity,drinkAPrice);

                }catch (NumberFormatException e){
                    System.out.println("The quantity entered is not accepted for this product");
                    System.out.println("Please insert an integer");


                }



        }
    }

    public  double finalPrice(double a , double b){
        double finalPrice =a*b;
        System.out.println("You have to pay " + finalPrice  + " ron");
        return finalPrice;
    }

}
