package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		//util 클래스의 sing() 메소드를 호출하려면?
		util.sing();
		// util 클래스의 dance() 메소드를 호출하려면?
		util.dance();
		//MainClass02 클래스의 sleep(0 메소드를 호출하려면??
		MainClass02.sleep();
	}
	
	public static void sleep() {
		System.out.println("잠을 자요~");
	}
}
