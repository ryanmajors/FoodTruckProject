package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	// Scanner, menu

	public static void main(String[] args) {
		FoodTruck[] allFoodTrucks = new FoodTruck[5];
		FoodTruckApp fta = new FoodTruckApp();
		int countTruck = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Relp!");
		System.out.println("I know you're hungry, so let's get started");

		while (countTruck < allFoodTrucks.length) {
			System.out.print("Enter the name of the truck you would like to rate or type quit: ");
			String truckName = sc.nextLine();

			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.print("Please enter the name of the item you ordered: ");
			String itemOrdered = sc.nextLine();

			System.out.print("Please enter the rating you want to give this truck: ");
			Double itemRating = sc.nextDouble();
			sc.nextLine();

			allFoodTrucks[countTruck] = new FoodTruck(truckName, countTruck, itemOrdered, itemRating);
			countTruck++;
		}
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println();
			fta.optionMenu();
			int choice = sc.nextInt();
			// display all food trucks stored in allFoodTrucks array
			switch (choice) {
			case 1:
				for (int i = 0; i < countTruck; i++) {
					System.out.println(allFoodTrucks[i].toString());
				}
				break;
			// print out average rating for all food trucks
			case 2:
				double sum = 0;
				for (int i = 0; i < countTruck; i++) {
					sum += allFoodTrucks[i].getRating();
				}
				System.out.println(
						"The average rating of all the food trucks in our system " + "is: " + (sum / countTruck));
				break;
			// prints out the highest rated food truck
			case 3:
				FoodTruck highestRated = allFoodTrucks[0];
				for (int i = 1; i < countTruck; i++) {
					FoodTruck newHighest = allFoodTrucks[i];
					if (newHighest.getRating() > highestRated.getRating()) {
						highestRated = newHighest;
					}
				}
				System.out.println("The highest rated truck is: " + highestRated);
				break;
			// quits program and prints quit message
			case 4:
				System.out.println("Have a wonderful day and thank you for choosing Relp!");
				keepGoing = false;

			}
		}
	} 

	// option menu once user enters food trucks or types quit
	public void optionMenu() {
		System.out.println("Menu");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks entered.");
		System.out.println("3. See the highest rated food truck.");
		System.out.println("4. Quit");
		System.out.println("Please enter the number that cooresponds with your choice");

	}

}
