package main.test;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * catch Exception 하나로 명시해도 된다. 왜냐하면 Exception이  부모이기때문에
 *  
 * 
*/
public class MainClass03 {

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
		}
		System.out.println("main 메소드가 종료됩니다.");
	}

}
