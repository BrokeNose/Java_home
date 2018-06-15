package test.main;

public class MainClass01 {
	// 클래스안에 정의할수 있는 것
	// field,method, static field, static method, constructor
	// class안에 class정의가능 static class
	
	
	//필드(MainClass01 이 만들어지면 생겨난다.객체하나하나당 만들어진다.)
	public int num=10;
	//static 필드 (객체생성과 상관없이 클래스안에 만들어진다. 오직하나)
	public static int num2=20;
	
	//static main 메소드(static method안에서는 this가 말이안된다.)
	public static void main(String[] args) {
//		int result=this.num;  이거는 참조가 안된다.
//		static 메소드 안에서는 static 자원들만 참조가능
		
//		참조가능
		int result2=MainClass01.num2;
		
		//내부클래스로 객체생성가능
		Gura g=new Gura();
	}
	//내부클래스 정의하기
	public static class Gura{
		
	}
}
