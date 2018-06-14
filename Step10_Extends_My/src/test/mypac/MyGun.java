package test.mypac;

public class MyGun extends Gun{
	//자식 생성자에서 부모생성자에 필요한 값을 전달받아서
	//부모 생성자에 넘겨 줘야한다.
	public MyGun(Bullet bullet) {
		super(bullet); //super() 는 부모 생성자를 의미한다. 
	}
	
	@Override
	public void fire() {
		super.fire(); //부모객체의 메소드를 호출해주는것
		//자식객체에서 부모객체를 가리키는 방법은 
		//super(); - 부모 호출
		//super.fire(); - 부모 참조
		System.out.println("내 마음대로 빵~빵~빵~!");
	}
}
