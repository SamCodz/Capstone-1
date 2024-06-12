package com.techelevator;

import com.techelevator.Products.Product;

public class Coinbox {
    private Inventory inventory;
    private Product product = null;
    private double userFunds = 0;
    private double cost;
    int nickle=0,dime=0,quarter=0;

    public Coinbox(Inventory inventory) {
        this.inventory = inventory;
    }

    public void addFunds(int funds){

         userFunds = userFunds + funds;
     }

    public double getUserFunds() {
        return userFunds;
    }

    public void boughtProduct(String slotID){
        product= inventory.buyProduct(slotID);

        if (product == null){
            System.out.println("The slot ID "+ slotID + " does not exist");
            return;
        }
        if (product.getAmt() <= 0) {
            System.out.println("The Item at " + product.getSlot() + " named " +product.getName() + " is sold out");
            return;
        }
        if (product.getPrice() > userFunds){
            System.out.println("Insufficient funds");
            return;
        }

        userFunds = userFunds - product.getPrice();
        System.out.println("Item bought was " + product.getName() + " Cost: $" + product.getPrice() + "\nRemaining Funds: $" + getUserFunds());
        System.out.println(product.purchaseMessage());
    }

    public void returnChange(){

        while(userFunds >0.25){
            userFunds = userFunds - 0.25;
            quarter++;
        }
        while(userFunds >0.10){
            userFunds = userFunds - 0.10;
            dime++;
        }
        while(userFunds >0.05){
            userFunds = userFunds - 0.05;
            nickle++;
        }

        System.out.println("Your change is:\n$" + quarter + " Quarters\n$" + dime + " Dimes\n$" + nickle + " Nickles");
    }
}
