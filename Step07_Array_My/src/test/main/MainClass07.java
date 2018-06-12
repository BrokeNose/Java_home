package test.main;

public class MainClass07 {
   @SuppressWarnings("unused")
   public static void main(String[] args) {
      System.out.println("main 메소드가 시작되었습니다.");
      // int type을 담을 수 있는 방 5개짜리 배열 객체 생성
      int[] nums = {0,0,0,0,0};
      
      //double type을 담을 수 있는 방 5개짜리 배열 객체 생성
      double[] doubles = {0.0, 0.0, 0.0, 0.0, 0.0};
      
      //String type을 담을 수 있는 방 5개짜리 배열 객체 생성
      String[] strings = {null, null, null, null, null};
      
      Person[] p = new Person[10];
      for(int i=0;i<10;i++) { 
         p[i] = new Person();
      }
      
      System.out.println(p[0].name);
   }
}


class Person {
   int num;
   String name;
}