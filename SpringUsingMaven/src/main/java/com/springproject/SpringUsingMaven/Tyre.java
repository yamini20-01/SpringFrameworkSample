package com.springproject.SpringUsingMaven;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	private String brand;

//	public Tyre(String brand) {
//		super();
//		this.brand=brand;
//  }
	public String getBrand() {
		return brand;
	}
	

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString(){
		return "Its working....";
	}
//	public String toString(){
//		return "Tyre [brand="+brand+"]";
//	}
	
}
