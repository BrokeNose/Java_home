//package test.main;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import test.mypac.MemberDto;
//
//public class MainClass07 {
//
//	public static void main(String[] args) {
//		/*
//		 * 1. MemberDto type 을 담을 ArrayList 객체를 생성해서
//		 * 
//		 * 2. 3명의 회원정보를 각각 MemberDto 객체에 담아서
//		 * 
//		 * 3. MemberDto 객체의 참조값을 ArrayList 객체에 저장하기
//		*/
//		List<Object> members = new ArrayList<>();
//		MemberDto member1=new MemberDto(1,"손대원","거여동");
//		MemberDto member2=new MemberDto(2,"홍길동","하늘섬");
//		MemberDto member3=new MemberDto(3,"김덕배","에란겔");
//		members.add(member1);
//		members.add(member2);
//		members.add(member3);
//		
//		
//		//참조 연습
//		List<MemberDto> a=members;
//		MemberDto b=members.get(0);
//		int c=members.get(0).getNum();
//		String d=members.get(0).getName();
//		String e=members.get(0).getName();
//		
//	}
//
//}


package test.main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		/*	
		 *  1. MemberDto type 을 담을 ArrayList 객체를 생성하고
		 *  
		 *  2. 3 명의 회원정보를 각각 MemberDto 객체에 담아서
		 *  
		 *  3. MemberDto 객체의 참조값을 ArrayList 객체에 저장하기
		 */
		
		//1.
		List<MemberDto> members=new ArrayList<>();
		Serializable members1=new ArrayList<>();
		
		//2.
		//MemberDto dto1=new MemberDto(1, "김구라", "노량진");
		//MemberDto dto2=new MemberDto(2, "해골", "행신동");
		//MemberDto dto3=new MemberDto(3, "원숭이", "동물원");
		MemberDto dto1=new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2=new MemberDto();
		dto2.setNum(2);
		dto2.setName("해골");
		dto2.setAddr("행신동");
		
		MemberDto dto3=new MemberDto();
		dto3.setNum(3);
		dto3.setName("원숭이");
		dto3.setAddr("동물원");
		
		//3.
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
				
		//참조 연습
		List<MemberDto> a=members;
		MemberDto b=members.get(0);
		int c = members.get(0).getNum();
		String d=members.get(0).getName();
		String e=members.get(0).getAddr();
		
		//4. members 에 들어 있는 회원정보를 for 문을 이용해서
		// 순서대로 콘솔창에 출력해보세요.
		// [출력 형식]
		//번호: 1  이름: 김구라 주소: 노량진
		for (int i = 0; i < members.size(); i++) {
			
			int Num = members.get(i).getNum();
			String Name=members.get(i).getName();
			String Addr=members.get(i).getAddr();
			System.out.println("번호: "+Num+" 이름: "+Name+" 주소: "+Addr);
		}
		System.out.println("--- 확장 for 문 ---");
		
		for (MemberDto tmp:members) {
			System.out.println("번호: "+tmp+" 이름: "+tmp+" 주소: "+tmp);
		}
		//선생님꺼랑다르니까 비교해서 확인하길
	}
}












