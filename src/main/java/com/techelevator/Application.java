package com.techelevator;

import java.util.Scanner;

public class Application {
	public static Scanner input = new Scanner(System.in);
	public static int userInput=0;
	public static double userMoney=0;
	public static Menus menu = new Menus();
	public static FileReader fileReader = new FileReader("vendingmachine.csv");
	public static Inventory inventory = new Inventory();
	public static Coinbox coinbox = new Coinbox(inventory);

	public static void main(String[] args) {
		inventory.addInventory(fileReader.productList());

		do {
			userInput = menu.mainMenu();
			if (userInput == 1){
				inventory.displayAll();
			} else if (userInput == 2){
				purchaseFunction();
			} else if (userInput == 4){
				System.out.println("hidden function");
			}

		}while(userInput!=3);


	}


	public static void purchaseFunction(){


		do {
			userInput = menu.purchaseMenu(coinbox.getUserFunds());
			if (userInput == 1){

				coinbox.addFunds(menu.feedMenu());
			} else if (userInput == 2){
				inventory.displayAll();
				coinbox.boughtProduct(menu.buyProduct());
				menu.pause();

			} else if (userInput == 3){
				coinbox.returnChange();
			}

		}while(userInput!=3);

	}


}
