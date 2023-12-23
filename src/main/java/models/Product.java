package models;

import java.time.LocalDate;

public class Product {
	 String name;
	  String code;
	  float price;
	  String type;
	  int quantity;
	  String urlImage;
	  boolean status;
	  LocalDate registerDate;
	  
	  
	public Product(String name, String code, float price, String type, int quantity, String urlImage, boolean status,
		LocalDate registerDate) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.urlImage = urlImage;
		this.status = status;
		this.registerDate = registerDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}
		  
}
