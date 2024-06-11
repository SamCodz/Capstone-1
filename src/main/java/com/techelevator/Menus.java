package com.techelevator;

import java.util.Scanner;

public class Menus {
    private final Scanner input = new Scanner(System.in);
    private int option;

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

    public int purchaseMenu(int userMoney){
        System.out.println("****************************************************************************");
        System.out.println("OUR VENDING MACHINE");
        System.out.println("****************************************************************************\n");
        System.out.println("Current Money Provided: $" + userMoney);

        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");

        return option;
    }

}
