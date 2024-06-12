package com.techelevator;

import java.util.Scanner;

public class Menus {
    private final Scanner input = new Scanner(System.in);
    private int option;
    private int total = 0;


    public int mainMenu(){
        System.out.println("****************************************************************************");
        System.out.println("OUR VENDING MACHINE");
        System.out.println("****************************************************************************\n");
        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
        System.out.print("Please enter your option: ");

        option = input.nextInt();
        if(option == 1){
        System.out.println("Slot   Item Name    Price       Type        Stock");
        }
        return option;
    }
    public String buyProduct(){
        System.out.println("Please select the slot of the product you want to buy");

        String test = input.nextLine();
        return test;
    }

    public int purchaseMenu(double userMoney){
        System.out.println("****************************************************************************");
        System.out.println("OUR VENDING MACHINE");
        System.out.println("****************************************************************************\n");
        System.out.println("Current Money Provided: $" + userMoney);

        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        System.out.print("Please enter your option: ");
        option = input.nextInt();
        if(input.hasNextLine()){
            input.nextLine();
        }

        return option;
    }

    public void pause(){
        System.out.print("Please press enter to continue");
        input.nextLine();
    }


    public int feedMenu(){
        System.out.println("Please enter $1 $5 $10 $20 $100 one at a time/nAnything letters to exit");
        while (input.hasNextInt()){
            total = total + input.nextInt();
        }
        input.next();
        return total;
    }


}
