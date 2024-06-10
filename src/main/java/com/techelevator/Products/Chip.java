package com.techelevator.Products;

public class Chip extends Product{


    public Chip(long price, String name, String slot) {
        super("Chip", price, name, slot);
    }

    @Override
    public String purchaseMessage() {
        amtReduce();
        return "Crunch Crunch, Yum!";
    }
}
