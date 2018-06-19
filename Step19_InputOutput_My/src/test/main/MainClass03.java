package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/*
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		InputStream is=System.in;
		InputStreamReader isr= new InputStreamReader(is);
		//InputStreamReader 객체를 생성자의 인자로 전달해서
		//Bufferedreader 객체의 참조값 얻어내기
		BufferedReader br= new BufferedReader(isr);
		System.out.println("문자열 한줄입력:");
		//Exception 발생하니까 마우스 커서대고 surround try
		try {
			String str=br.readLine();
			System.out.println("입력한 문자열:"+str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
