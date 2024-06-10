package com.techelevator;

import java.util.Scanner;

public class Application {
	public static Scanner input = new Scanner(System.in);
	public static int userInput;

	public static void main(String[] args) {

		menu();
	}

	public static int menu(){
		System.out.println("****************************************************************************");
		System.out.println("OUR VENDING MACHINE");
		System.out.println("****************************************************************************\n");
		System.out.println("(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		userInput = input.nextInt();


	}
}
