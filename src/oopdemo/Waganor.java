package oopdemo;

public class Waganor extends Car{
	
	
	public void fuelTypezCng() {
		System.out.println("Its a Cng model");
	}
	
	public static void main(String[] args) {
		Waganor w = new Waganor();
		
		w.changeGear();
	}

}
