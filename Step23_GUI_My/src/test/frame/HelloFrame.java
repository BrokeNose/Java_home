package test.frame;

import javax.swing.JFrame;

/*
 * 	[ GUI Frame 만들기 ]
 * 
 * - JFrame 클래스를 상속받은 클래스를 저으이한다.
 * - 해당 클래스로 객체 생성을 한다.
 */
public class HelloFrame extends JFrame {
	//생성자 
	public HelloFrame() {
		//크기와 위치 설정
		this.setBounds(100, 100, 500, 300);
		//제목 설정
		this.setTitle("블랙Hat");
		// x 를 눌렀을때 프로세스가 종료 되도록 설정
		setDefaultCloseOperation(HelloFrame.EXIT_ON_CLOSE);
//		setDefaultCloseOperation(EXIT_ON_CLOSE); // 같은 HelloFrame 객체 안에 있으므로 생략  가능
		
		//화면에 보이도록 설정
		setVisible(true);
	}
	
	//HelloFrame 클래스로 객체를 생성하기 위한 main 메소드
	public static void main(String[] args) {
		new HelloFrame();
	}

}
