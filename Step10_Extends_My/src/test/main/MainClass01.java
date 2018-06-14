package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		//phone 클래스를 상속받은 HnadPhone 클래스의 생성자를 호출해서
		//객체를 생성한후 참조값을 HandPhone type 변수에 담는다.
		HandPhone p=new HandPhone();
		//Phone 클래스에 정의된기능
		p.call();
//		HandPhone 클래스에 정의된 기능
		p.mobileCall();
		p.takePicture();
		
		
		
		
	}
}
