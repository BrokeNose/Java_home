package test.mypac;

public class SmartPhone extends HandPhone{
	//HandPhone 을 상속 받는다.
	
	//인터넷을 하는 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//takePicture() 메소드 재정의(오버라이드) 하기
	// override 는  없어도 되지만 부모 메소드의 takePicture 을 재정의한다고 표시해놓는것
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}
