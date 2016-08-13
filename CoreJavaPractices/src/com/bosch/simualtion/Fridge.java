package com.bosch.simualtion;

public class Fridge implements ISwitch{

	public void cooling(){
		System.out.println("Fridge is cooling");
	}
	
	public void stop(){
		System.out.println("Fridge is stopped");
	}

	@Override
	public void on() {
		cooling();
	}

	@Override
	public void off() {
		stop();
	}
}
