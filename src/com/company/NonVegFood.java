package com.company;

public class NonVegFood extends FoodDecorator{
    public NonVegFood(Food newFood) {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood() +" Cu Pui Prăjit și Pui Curry  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+150.0;
    }
}