package org.example.NonFoodPackage;

import org.example.Exceptions.invalidInsert;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NonFood {
    private String nameProduct;
    private double priceProduct;

    public NonFood(String nameProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public static void nonFoodSelection() {
        System.out.println("This section is divide into two branches :" +
                "\n 1. For women" +
                "\n 2. For men" +
                "\n Insert the branches you want: ");

        Scanner sc = new Scanner(System.in);
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:
                System.out.println("You are in women sector :");
                Women.showClothes();

                System.out.println("Insert the clothes you want to buy:");
                String clothName = sc.nextLine().toLowerCase();

                double clothPrice = 0;
                if (clothName.equals("dresses")) {
                    clothPrice = 130;
                } else if (clothName.equals("jacket")) {
                    clothPrice = 250;
                } else if (clothName.equals("tshirt")) {
                    clothPrice = 78;
                } else if (clothName.equals("hats")) {
                    clothPrice = 38;
                } else if (clothName.equals("shirt")) {
                    clothPrice = 90;
                } else if (clothName.equals("scarf")) {
                    clothPrice = 35;
                } else if (clothName.equals("underwear")) {
                    clothPrice = 20;
                } else {
                    System.out.println("We dont have this product for now , try later !");
                }
                List <String> Sizes=new ArrayList<>();
                String xs="XS";
                String s="S";
                String m= "M";
                String l= "L";

                Sizes.add(xs);
                Sizes.add(s);
                Sizes.add(m);
                Sizes.add(l);

                System.out.println("Insert the size you want");
                String size = sc.nextLine().toUpperCase(Locale.ROOT);
                if (Sizes.contains(size)) {
                    System.out.println("Insert the quantity:");

                }else {
                    System.out.println("We dont have the size you want");
                    break;

                }



                try {
                    int Quantity = Integer.parseInt(sc.nextLine());
                    Women women= new Women(clothName,clothPrice,size);

                    women.toBePaid(Quantity, clothPrice);


                } catch (NumberFormatException e) {
                    System.out.println("The quantity entered is not accepted for this product");
                    System.out.println("Please insert an integer");


                }
                break;


            case 2:
                System.out.println("You are in men sector");
                Men.showManClothes();
                System.out.println("Insert the clothes you want to buy:");
                String NameClothe = sc.nextLine().toLowerCase();

                double PriceClothes = 0;
                if (NameClothe.equals("jeans")) {
                    PriceClothes = 100;
                } else if (NameClothe.equals("parka")) {
                    PriceClothes = 138;
                } else if (NameClothe.equals("sweatpants")) {
                    PriceClothes = 99;
                } else if (NameClothe.equals("shirt")) {
                    PriceClothes = 138;
                } else if (NameClothe.equals("jacket")) {
                    PriceClothes = 300;
                } else if (NameClothe.equals("panties")) {
                    PriceClothes = 50;
                } else {
                    System.out.println("We dont have this product for now , try later !");
                }

                List <String> sizes=new ArrayList<>();
                String S="S";
                String M="M";
                String L= "L";
                String XL= "XL";

                sizes.add(S);
                sizes.add(M);
                sizes.add(L);
                sizes.add(XL);


                System.out.println("Insert the size you want");
                String Size = sc.nextLine().toUpperCase();
                if (sizes.contains(Size)) {
                    System.out.println("Insert the quantity:");
                }else {
                    System.out.println("We dont have this size , sorry");
                    break;
                }



                try {
                    int Quantity = Integer.parseInt(sc.nextLine());
                    Men men = new Men(NameClothe,PriceClothes,Size);

                    men.toBePaid(Quantity, PriceClothes);


                } catch (NumberFormatException e) {
                    System.out.println("The quantity entered is not accepted for this product");
                    System.out.println("Please insert an integer");
                }
        }


    }

    public  double toBePaid(double a, double b) {
        double toBePaid = a * b;
        System.out.println("You have to pay " + toBePaid + " ron");
        return toBePaid;
    }
}

