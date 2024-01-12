package oopdemo;

public class Honda extends Car{
	
	
	public void fuelTypezPetrol() {
		System.out.println("Its a petrol model");
	}
	
	public void hasSunRoff() {
		System.out.println("Its a sunroof");
	}
	
	 public static void main(String[] args) {
		 
		 Honda h = new Honda();
		 
		 h.changeGear();
		
	}
	
	
	

}
