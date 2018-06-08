package test.main;

import test.mypac.AttackUnit;
import test.mypac.Person;


public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * AttackUnit 클래스를 이용해서 객체를 생상하고 
		 * 참조값(id) 값에 . 찍어서 attack() 메소드 호출하기
		*/
		 new AttackUnit().attack();
		 AttackUnit unit=new AttackUnit();
		 unit.attack();
		 unit.attack();
		 unit.attack();
		 unit.attack();
		
		//AttackUnit 클래스로 새로운 객체 생성해서 
		 //attack() 메소드를 3번 호출해 보세요.
		 AttackUnit first=new AttackUnit();
		 first.attack();
		 first.attack();
		 first.attack();
		 int pi=first.energy;
		 
		 Person person1=new Person();
		 person1.num=1;
		 person1.name="손대원";
		 person1.addr="거여동";
		 
		 Person person2=new Person();
		 person2.num=1;
		 person2.name="";
	}
}
