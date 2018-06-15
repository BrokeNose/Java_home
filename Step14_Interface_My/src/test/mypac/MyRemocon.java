package test.mypac;
/*
 *  Remocon 인터페이스를 implements 한 클래스 정의하기
 *  
 *  - 인터페이스에 정의된 모든 추상 메소드를 오버라이드 해야한다.
*/
public class MyRemocon implements Remocon{// object, MyRemocon, Remocon:  type으로 쓸수있다.

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 올려요");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 내려요");
	}

}
