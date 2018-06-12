package test.main;

import test.auto.Car;

public class MainClass08 {
   public static void main(String[] args) {
      //Car type을 담을 수 있는 방 5개짜리 배열 객체를 생성해보세요.
      Car[] cars = new Car[5];
      // 0번 방에 Car 객체의 참조값을 대입해 보세요.
      cars[0] = new Car();
      // 1번 방에 Car 객체의 참조값을 대입해 보세요.
      cars[1] = new Car();
      // Car 객체를 생성해서 참조값을 변수에 담기
      Car c = new Car();
      
      cars[0].drive();
      
      // 2번방과 3번방에 c라는 변수에 있는 참조 값을 대입
      cars[2] = c;
      cars[3] = c;
      
      cars[2].val = 3;
      System.out.println(cars[3].val);
      
      // 0번 방에 있는 참조 값을 4번 방에 대입
      cars[4] = cars[0];
      cars[0].val = 15;
      System.out.println(cars[4].val);
   }
}