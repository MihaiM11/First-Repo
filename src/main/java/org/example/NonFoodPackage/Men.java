package org.example.NonFoodPackage;

public class Men extends NonFood{
    private String size;

    public Men(String productName,double productPrice,String size){
        super(productName,productPrice);
        this.size=size;


    }
    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size=size;
    }

    public static void showManClothes(){
        System.out.println("For man we have following articles:");
        String jeans= "jeans";
        String parka="parka";
        String sweatPants="sweatpants";
        String shirt="shirt";
        String jacket="jacket";
        String panties="panties";


        double jeansPrice=100;
        double parkaPrice=138;
        double sweatPantsPrice=99;
        double shirtPrice=138;
        double jacketPrice=300;
        double pantiesPrice=50;

        System.out.println("1." + jeans + " at price " + jeansPrice);
        System.out.println("2." + parka + " at price " + parkaPrice);
        System.out.println("3." + sweatPants + " at price " + sweatPantsPrice);
        System.out.println("4." + shirt + " at price " + shirtPrice);
        System.out.println("5." + jacket+ " at price " + jacketPrice);
        System.out.println("6." + panties + " at price " + pantiesPrice);

        System.out.println("For all this products we have next sizes available: S,M,L,XL");

    }



}
