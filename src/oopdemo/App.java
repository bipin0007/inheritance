package oopdemo;

public class App {

	public static void main(String[] args) {
		//Single
		Student s = new Student();
		s.attendClass();
		s.giveExam();
		s.doexecrcise();
		s.eat();
		
		
		//Multilevel
		Teacher t = new Teacher();
		t.conductExams();
		t.doexecrcise();
		t.eat();
		
		
		
		//Hierarchical
		Staff st = new Staff();
		st.conductExams();
		st.doexecrcise();
		

	}

}
