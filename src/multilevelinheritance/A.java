package multilevelinheritance;

public class A extends B {
	
	public void display() {
		System.out.println("This is used for display feature");
	}
	
	public void provideInput() {
		System.out.println("This is used for providing input");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.display();
		a.provideInput();
		a.getout();
		a.human();
	}

}
