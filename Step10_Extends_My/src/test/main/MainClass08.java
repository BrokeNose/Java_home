package test.main;

import test.mypac.Navi;
import test.mypac.Tmap;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 1. Navi 클래스를 상속받은 클래스를 정의해서
		 * 2. 그 클래스를 생성한 객체의 참조값을 얻어내서
		 * 3. 아래의 useNavi 메소드를 호출해보세요
		*/
		Navi n1=new Tmap();
		MainClass08.useNavi(n1);
		
		Tmap t1=new Tmap();
		MainClass08.useNavi(t1);
	}
	
	public static void useNavi(Navi navi) {
		navi.findWay();
	}
	public static void useNavi(Tmap tmap) {
		tmap.mapStart();
		tmap.mapEnd();
	}
}
