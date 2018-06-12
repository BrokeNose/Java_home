package test.main;

import test.mypac.Acorn;

public class MainClass02 {
	public static void main(String[] args) {
		// Acorn 클래스를 이용해서 객체를 생성한후 참조값을 변수에 담기
		Acorn a=new Acorn();
		
		// branch 라는 필드에 값 대입하기
		a.branch="종로지점";
		
		
		// 객체를 만드는 것 만으로도 오브젝트를 상속을 받는다. (모든 클래스가 자동으로상속받는 메소드)
		// 속성은 필드 기능은 메소드;  속성과 기능을 분리 할줄알아야한다. 
		a.makeDeveloper();
		
		Acorn b= new Acorn();
		b.branch="강남지점";
		b.makeDeveloper();
		
		
	}
}
