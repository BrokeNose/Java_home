package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		// 1. String type 을 담을수 있는 방 5개짜리 배열 객체를 생성
		String[] friends=new String[5];
		// 2. 배열에 5개의 방에 각각 다른 문자열 저장하기
		friends[0]="이효익";
		friends[1]="김시훈";
		friends[2]="박진수";
		friends[3]="김종규";
		friends[4]="박재형";
		// 3. 반복문 for 를 이용해서 5개의 방에 있는 문자열을 순서대로 콘솔창에 출력하기
		for (int i = 0; i < friends.length; i++) {
			String tmp=friends[i];
			System.out.println("친구들: "+tmp);
		}
	}
}
