package org.example;

import org.example.DrinksPackage.Drinks;
import org.example.FoodPackage.Food;
import org.example.NonFoodPackage.NonFood;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class StoreTest {
    Food food;
    Drinks drinks;
    NonFood nonFood;

    @Before

    public void setup(){
        food=new Food("food",0);
        drinks=new Drinks("Drinks",0);
        nonFood=new NonFood("nonFood",0);


    }

    @Test
    public void testToBePaid(){
       double toBePaid= food.toBePaid(8,9.9);
       assertEquals(79,toBePaid,2);



    }

    @Test
    public void testFinalPrice(){
        double finalPrice=drinks.finalPrice(5,6.5);
        assertEquals(30,finalPrice,5);
    }

    @Test
    public void testToBePaidNonFood(){
        double toBePaidNonFood= nonFood.toBePaid(9,7.2);
        assertEquals(64,toBePaidNonFood,8);
    }




}
