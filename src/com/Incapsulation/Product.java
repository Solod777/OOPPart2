package com.Incapsulation;

public class Product { /// Модель интернет-магазина
	
	private int price;
	private String description;
	private String title;
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if (price <= 0) {
			this.price = 10000;
		} else {
			this.price = price;
		}
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription (String description) {
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	


}
