package com.bosch.simualtion;

public class Simulator {

	
	public static void main(String[] args) {
		
		System.out.println("SIMULATION STARTED ...");
		
		processBulbSimulation(args);
		
		processFanSimulation(args);
		
		processFridgeSimulation(args);
		
		System.out.println("SIMULATION ENDED ...");
		
	}

	private static void processFridgeSimulation(String[] args) {
		
		if(args[0].equals("FRIDGE")){
			ISwitch fridgeSwitch = new Fridge();
			if(args[1].equals("ON")){
				fridgeSwitch.on();	
			}else{
				fridgeSwitch.off();
			}
		}
	}

	private static void processFanSimulation(String[] args) {
		
		if(args[0].equals("FAN")){
			ISwitch fanSwitch = new Fan();
			
			if(args[1].equals("ON")){
				fanSwitch.on();	
			}else{
				fanSwitch.off();
			}
		}
	}

	private static void processBulbSimulation(String[] args) {
		if(args[0].equals("BULB")){
			ISwitch bulbSwitch = new Bulb();
			if(args[1].equals("ON")){
				bulbSwitch.on();	
			}else{
				bulbSwitch.off();
			}
		}
	}
	
}
