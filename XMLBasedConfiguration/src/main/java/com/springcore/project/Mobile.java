package com.springcore.project;

public class Mobile {

	private double price;
	private String brand;
	private String color;

	public Mobile(double price, String brand, String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
	}

	public Mobile() {
		super();

	}

	public void init() {
		System.out.println("Hello I'm Init Method");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void destroy() {
		System.out.println("Hello I'm Destroy Method");
	}

	@Override
	public String toString() {
		return "Mobile [price=" + price + ", brand=" + brand + ", color=" + color + "]";
	}
	
	
}
