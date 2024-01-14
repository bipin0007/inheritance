package multilevelinheritance;

public class B extends C{
	
	public void getout() {
		System.out.println("This will give you output");
	}
	
	public static void main(String[] args) {
		B b = new B();
		
		b.getout();
		b.human();
	}

}
