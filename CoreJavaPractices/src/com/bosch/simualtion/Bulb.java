package com.bosch.simualtion;

public class Bulb implements ISwitch {

	
	public void glow(){
		
		System.out.println("Blub is Glowing");
	}
	
	public void dim(){
		
		System.out.println("Blub is Dim");
	}

	@Override
	public void on() {
		glow();
	}

	@Override
	public void off() {
		dim();
	}
}
