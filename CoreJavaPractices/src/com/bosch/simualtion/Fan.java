package com.bosch.simualtion;

public class Fan implements ISwitch {

	public void start(){
		
		System.out.println("Fan is Rotating");
	}
	
	public void stop(){
		
		System.out.println("Fan is Stopping");
	}

	@Override
	public void on() {
		start();
	}

	@Override
	public void off() {
		stop();
	}
		
}
