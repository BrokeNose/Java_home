package test.main;

import test.mypac.Weapon;

public class MainClass03 {

	public static void main(String[] args) {
		// 수열이형을 공격하고 싶으면?
		Weapon w1=new Weapon() {// <-- 이름이 없는 클래스이다.(익명의(Anonymous) Local Inner 클래스)

			@Override
			public void attack() {
				System.out.println("수열이형을 공격해요");
				
			} 
			
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("누군가를 공격해요");
			}
			
		});

	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}
