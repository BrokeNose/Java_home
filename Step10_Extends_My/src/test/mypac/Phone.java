package test.mypac;

public class Phone extends Object{
	// 아무것도 생성하지않아도 디폴트 생성자가 생략되어있다.
	/*
	 * public Phone(){
	 * 
	 * } 이 생략되어있다.
	*/
	//public class Phone extends Object{
	//}
	//extends 는 상속을 받을수있게하는 명령어이다.
	// Object 는 상속받을 이름
	
	//전화 거는 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
