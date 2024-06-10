package com.techelevator;

import java.util.Scanner;

public class Application {
	public static Scanner input = new Scanner(System.in);
	public static int userInput=0;
	public static long userMoney=0;

	public static void main(String[] args) {
		System.out.println("3");
		do {
			userInput = menu();
			if (userInput == 1){
				//Display items
			} else if (userInput == 2){
				purchaseFunction();
			} else if (userInput == 4){
				System.out.println("hidden function");
			}

		}while(userInput!=3);


	}

	public static int menu(){
		System.out.println("****************************************************************************");
		System.out.println("OUR VENDING MACHINE");
		System.out.println("****************************************************************************\n");
		System.out.println("(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");

		return input.nextInt();

	}

	public static int purchaseMenu(){
		System.out.println("****************************************************************************");
		System.out.println("OUR VENDING MACHINE");
		System.out.println("****************************************************************************\n");
		System.out.println("Current Money Provided: $" + userMoney);

		System.out.println("(1) Feed Money");
		System.out.println("(2) Select Product");
		System.out.println("(3) Finish Transaction");
		return input.nextInt();

	}

	public static void purchaseFunction(){


		do {
			userInput = purchaseMenu();
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
