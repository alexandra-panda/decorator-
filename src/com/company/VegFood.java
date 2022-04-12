package com.company;

public class VegFood implements Food {
    public String prepareFood(){
        return "Mancare Vegana";
    }

    public double foodPrice(){
        return 60.0;
    }
}