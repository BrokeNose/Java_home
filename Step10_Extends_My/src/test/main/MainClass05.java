package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//SmartPhone type 객체를 생성해서 Object type 변수에 담기
		Object p1=new SmartPhone();
		//부모는 자식안에 들어갈수없다. 부모가 자식안에 들어가려면 캐스팅해야한다.
		//Phone 으로 casting 해서 대입 (Phone) 이 캐스팅하는것 p1은 위에  부모인Object로 정의했음.
		//캐스팅은 강제로 지정하는것
		//Phone 으로 casting 해서 대입
		Phone p2=(Phone)p1;
		//HandPhone 으로 casting 해서 대입
		HandPhone p3=(HandPhone)p1;
		//SmartPhone 으로 casting 해서 대입
		SmartPhone p4=(SmartPhone)p1;
	}
}
