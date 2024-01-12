package oopdemo;

public class Tata extends Car{
	
	
	
	public void fuelTypezDiesel() {
		System.out.println("Its a Diesel model");
	}
	
	@Override
	public void changeGear() {
		System.out.println("Tata has its own rule of changing the gear");

	}
	
	
	
	public static void main(String[] args) {
		Tata t = new Tata();
		
		
		t.changeGear();
		
	}

}
