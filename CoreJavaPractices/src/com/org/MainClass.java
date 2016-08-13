package com.org;

import java.util.Date;

public class MainClass {

	public static void main(String... args) { // Main Thread

		System.out.println(new Date());
	}
}

class SavingAccountHolder{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Car{
	
	private int vin;
	
	private String name;

	Car(int vin, String name){
		super();
		this.vin = vin;
		this.name = name;
	}
	
	public int getVin() {
		return vin;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return this.vin + " - "+ this.name;
	}
	
}
