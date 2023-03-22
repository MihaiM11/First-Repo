package org.example.FoodPackage;

import org.example.Exceptions.invalidInsert;

import java.util.*;

public class Food {
    private String productName;
    private double productPrice;


    public Food(String productName, double productPrice) {


        this.productName = productName;
        this.productPrice = productPrice;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public static void foodSelection() throws invalidInsert {
        Scanner sc = new Scanner(System.in);

            System.out.println( "Now you can choose what product you want to buy:" +
                    "\n 1. Vegetables - if you want to buy vegetables insert 1" +
                    "\n 2. Fruits- if you want to buy fruits insert 2 " +
                    "\n 3. Food products- if you want to buy food products insert 3" +
                    "\n 4. Exit");

            System.out.println("Insert your option:");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    Vegetables.showVegetables();
                    System.out.println("Insert your product:");
                    String productName = sc.nextLine().toLowerCase();

                    double productPrice = 0;
                    if (productName.equals("potatoes")) {
                        productPrice = 3.2;
                    } else if (productName.equals("cucumbers")) {
                        productPrice = 6;
                    } else if (productName.equals("onion")) {
                        productPrice = 3;
                    } else if (productName.equals("peppers")) {
                        productPrice = 9.7;
                    } else {
                        System.out.println("We dont have the product !");
                    }


                    System.out.println("Insert the quantity (Kilograms)");
                    double kilograms = Double.parseDouble(sc.nextLine());

                    Vegetables vegetables = new Vegetables(productName, productPrice, kilograms);

                    vegetables.toBePaid(productPrice, kilograms);

                    break;
                case 2:
                    Fruits.showFruits();
                    System.out.println("Insert the fruit you want to buy");
                    String fruitName = sc.nextLine().toLowerCase();

                    double fruitPrice = 0;
                    if (fruitName.equals("apple")) {
                        fruitPrice = 3;
                    } else if (fruitName.equals("pear")) {
                        fruitPrice = 7;
                    } else if (fruitName.equals("grape")) {
                        fruitPrice = 9;
                    } else if (fruitName.equals("banana")) {
                        fruitPrice = 5.5;
                    } else {
                        System.out.println("We dont have the fruit you want");
                    }


                    System.out.println("Insert the quantity:");
                    double fruitQuantity = Double.parseDouble(sc.nextLine());

                    Fruits fruits = new Fruits(fruitName, fruitPrice, fruitQuantity);

                    fruits.toBePaid(fruitQuantity, fruitPrice);
                    break;

                case 3:
                    FoodProducts.showProducts();
                    System.out.println("Insert the product you want to buy:");
                    String foodProduct = sc.nextLine().toLowerCase();

                    double foodPrice = 0;
                    if (foodProduct.equals("bread")) {
                        foodPrice = 5;
                    } else if (foodProduct.equals("chips")) {
                        foodPrice = 9;
                    } else if (foodProduct.equals("croissant")) {
                        foodPrice = 4.5;
                    } else if (foodProduct.equals("cookies")) {
                        foodPrice = 3.5;
                    } else {
                        System.out.println("We dont have the product");
                    }
                    System.out.println("Insert the quantity:");
                    try {
                        int foodQuantity = Integer.parseInt(sc.nextLine());

                        FoodProducts foodProducts = new FoodProducts(foodProduct, foodPrice, foodQuantity);

                        foodProducts.toBePaid(foodQuantity, foodPrice);


                    } catch (NumberFormatException e) {
                        System.out.println("The quantity entered is not accepted for this product");
                        System.out.println("Please insert an integer");


                    }
                    break;

                case 4:
                    System.exit(0);
            }
        }



    public  double toBePaid(double a, double b) {
        double toBePaid = a * b;
        System.out.println("You have to pay " + toBePaid + " ron");
        return toBePaid;


    }
}




