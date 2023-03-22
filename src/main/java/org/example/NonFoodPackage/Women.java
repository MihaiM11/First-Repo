package org.example.NonFoodPackage;

import java.util.Scanner;

public class Women extends NonFood{
    private String  size;

    public Women(String nameProduct, double priceProduct, String size){
        super(nameProduct,priceProduct);
        this.size=size;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public  static void showClothes(){
        System.out.println("In this section we have article only for women" );

                System.out.println("We have following assortment:");
                String dresses= "dresses";
                String jacket="jacket";
                String tshirts="Tshirts";
                String hats="hats";
                String shirts="shirts";
                String scarf="scarf";
                String underwear="underwear";

                double dressesPrice=130;
                double jacketPrice=250;
                double tshirtsPrice=78;
                double hatsPrice=38;
                double shirtsPrice=90;
                double scarfPrice=35;
                double underwearPrice=20;

                System.out.println("1." + dresses + " at price " + dressesPrice );
                System.out.println("2." + jacket + " at price " + jacketPrice);
                System.out.println("3." + tshirts + " at price " + tshirtsPrice);
                System.out.println("4." + hats + " at price " + hatsPrice);
                System.out.println("4." + shirts+ " at price " + shirtsPrice);
                System.out.println("4." + scarf + " at price " + scarfPrice);
                System.out.println("4." + underwear + " at price " + underwearPrice);
                System.out.println("For all this products we have next sizes available: XS,S,M,L");








    }

}
