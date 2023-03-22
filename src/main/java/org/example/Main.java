package org.example;

import org.example.DrinksPackage.Drinks;
import org.example.Exceptions.invalidInsert;
import org.example.FoodPackage.Food;
import org.example.NonFoodPackage.NonFood;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws invalidInsert {
        Scanner sc = new Scanner(System.in);


       while(true){
           System.out.println("Hello" +
                   "\nWelcome to our store!" +
                   "\nHere you find next kind of products:" +
                   "\n1.Food" +
                   "\n2.Drinks" +
                   "\n3.Non-Food");
           System.out.println("For next please select your option:");
           try {
               int option = Integer.parseInt(sc.nextLine());



           switch (option) {
               case 1:
                   System.out.println("So, you want to buy some food :))");
                   Food.foodSelection();
                   break;

               case 2:
                   System.out.println("So, you wanna buy some drinks :))");
                   Drinks.showDrinks();
                   break;

               case 3:
                   System.out.println("Non Food");
                   NonFood.nonFoodSelection();


           }
        }catch (NumberFormatException e){
               System.out.println("Your option is not accepted !");
               System.out.println("Please insert an integer number");
           }
        }
    }
}