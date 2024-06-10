package com.techelevator;

public class Product {
    private final String slot;
    private final String name;
    private final long price;
    private final String typeName;
    private int amt=5;

    public Product(String typeName, long price, String name, String slot) {
        this.typeName = typeName;
        this.price = price;
        this.name = name;
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }


    public int getAmt() {
        return amt;
    }

    public void purchase() {
        amt = amt-1;
    }

    @Override
    public String toString() {
        return "slot='" + slot + '|' +
                ", name='" + name + '|' +
                ", price=" + price + '|'+
                ", typeName='" + typeName;
    }
}



//    public Product(String name, long price) {
//        this.name = name;
//        this.price = price;
//        this.typeName = "";
//        this.slot ="";
//    }

