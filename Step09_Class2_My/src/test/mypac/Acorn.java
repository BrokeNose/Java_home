package test.mypac;
//클래슬 설계단계
public class Acorn {
	//Field(속성,저장소) 정의하기
	public String branch;
	
	// Method(기능) 정의하기
	// 스테틱을 안붙였기때문에 참조값으로 호출할 기능이다.
	public void makeDeveloper() {
		System.out.println(this.branch+" 에서 개발자를 양성해요~");
		
		// 객체안에서  자기자신의 아이디를 찾는 예약어는 this 이다. this.  
	}
}
