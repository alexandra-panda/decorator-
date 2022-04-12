package com.company;

public class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood)    {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +" Cu orez prajit si manciurian  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+50.0;
    }
}