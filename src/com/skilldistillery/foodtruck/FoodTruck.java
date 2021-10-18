package com.skilldistillery.foodtruck;

public class FoodTruck {

	// temp to assign next truck id
	public static int nextTruckId = 1;

	// FoodTruck fields
	private int truckId = 1;
	private String truckName = "";
	private String foodType = "";
	private double rating = 0.0;

	// FoodTruck constructor
	public FoodTruck(String truckName, int truckId, String foodType, double rating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		// increase the truck id by 1
		this.truckId = nextTruckId++;
	}

	// getters and setters for FoodTruck fields
	public int getNumId() {
		return truckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public double getRating() {
		return rating;
	}

	// toString method
	public String toString() {
		String output = "Truck name: " + truckName + ", truck id: " + truckId + ", item ordered: " + foodType
				+ ", Rating: " + rating;
		return output;
	}

}
