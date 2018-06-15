package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {//익명의 로칼 클래스
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("채널을 올려요");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("채널을 내려요");
			}
		}; 
		// useRemocon() 메소드에 Remocon type 참조값 전달
		useRemocon(r1);	
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("온도를 올려요");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("온도를 내려요");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		
	}
}
