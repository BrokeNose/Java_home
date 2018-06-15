package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Apple 객체를 담을 수 있는 FruitBox 객체 생성
		FruitBox<Apple> aBox=new FruitBox<Apple>();
		aBox.push(new Apple());
		
		//Banana 객체를 담을수 있는  FruitBox  객체를 생성해서
		FruitBox<Banana> bBox=new FruitBox<Banana>();
		//Banana 객체를 담아 보세요.
		bBox.push(new Banana());
		
		
		FruitBox<Orange> oBox=new FruitBox<>();
		oBox.push(new Orange());
		
	}

}
