package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class Application {
	public static Scanner input = new Scanner(System.in);
	public static int userInput=0;
	public static double userMoney=0;
	public static Menus options = new Menus();
	public static FileReader fileReader = new FileReader("vendingmachine.csv");
	public static Inventory inventory = new Inventory();

	public static void main(String[] args) {
		inventory.addInventory(fileReader.productList());

		do {
			userInput = options.mainMenu();
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
			userInput = options.purchaseMenu(0);
			if (userInput == 1){
				System.out.println("7.i");
			} else if (userInput == 2){
				System.out.println("7.ii");

			} else if (userInput == 3){
				System.out.println("7.iii");
			}

		}while(userInput!=3);

	}


}
