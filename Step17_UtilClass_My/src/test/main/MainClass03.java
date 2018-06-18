package test.main;

import java.util.ArrayList;

import test.mypac.Person;

public class MainClass03 {
	public static void main(String[] args) {
		/*String type 을 담을수 있는 ArrayList 객체를 생성해서
		 * 문자열을 3개 저장해보세
		 * 
		*/
		ArrayList<String> text=new ArrayList<>();
		text.add("김구라");
		text.add("손대원");
		text.add(new String("홍길동"));
		
		// Person typel 을 담을수 있는 ArrayList 객체를 생성해서
		ArrayList<Person> person=new ArrayList<>();
		Person person1=new Person();
		// Person 객체를 3개 저장해 보세요
		person.add(person1);
		person.add(new Person());
		person.add(new Person());
	}

	
}
