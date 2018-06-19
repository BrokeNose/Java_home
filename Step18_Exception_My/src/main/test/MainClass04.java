package main.test;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 	try{
 * 		Exception 이 발생할 가능성이 있는 코드 블럭
 * 		.
 * 		.
 * }catch(Exception type 변수명){
 * 		Exception 이 발생했을때 실행할 코드 블럭
 * }catch(Exception type 변수명){
 * 		Exception 이 발생했을때 실행할 코드 블럭
 * }finally{
 * 		예외 발생과 상관 없이 실행이 보장되는 블럭
 * }
 * .
 * .
 * .
 * .
*/
public class MainClass04 {

	public static void main(String[] args) {
		//키보드로 부터 입력 받을 Scanner 객체
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("나눌수 입력:");
			int num1=scan.nextInt();
			System.out.println("나누어 지는 수 입력:");
			int num2=scan.nextInt();
			
			//num2 를 num1으로 나눈 몫
			int mog=num2/num1;
			// num2 를 num1 으로 나눈 나머지
			int na=num2%num1;
			
			System.out.println(num2+" 를 "+num1+" 으로 나눈 결과");
			System.out.println("몫:"+mog+" 나머지:"+na);
		}catch(Exception e) {
			System.out.println("기타 Exception 발생!");
			e.printStackTrace();
		}finally {
			//예외발생과 상관없이 실행이 보장되는 블럭
			//보통 여기에서 마무리 작업을 한다.	
			System.out.println("마무리 작업을 합니다.");
		}
		System.out.println("main 메소드가 종료됩니다.");
	}

}
