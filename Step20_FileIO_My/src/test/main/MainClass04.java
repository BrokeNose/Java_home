package test.main;

import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		try {
			FileWriter fw= new FileWriter("c:/myFolder/monkey.txt",true);
			fw.write("원숭아~\r\n");
			fw.write("당구 한게임 콜?\r\n");
			fw.flush();
			fw.close();
		}catch (IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("monkey.txt 에 문자열을 기록했습니다.");
		
	}
}

//scanner 이용해서  입력한 문자열 text에 입력하기