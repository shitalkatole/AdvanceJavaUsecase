package com.springcore.lifecycle;

public class Book {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("setting price");
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}

	public void init() {
		System.out.println("inside init method");
	}

	public void destroy() {
		System.out.println("inside destroy method");
	}

}
