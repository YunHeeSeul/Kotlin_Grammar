package com.lannstark.lec12;

public class Lec12Main {

  public static void main(String[] args) {
    //3. 익명클래스
    //일회성으로 moveSomething을 불러주고 싶을 때
    //다음과 같이 new Movable 괄호 치고 그 안에 인터페이스를 구현해서
    //익명 클래스를 만들어 함수의 인자로 던질 수 있었음
    moveSomething(new Movable() {
      @Override
      public void move() {
        System.out.println("움직임");
      }

      @Override
      public void fly() {
        System.out.println("날아");
      }
    });
  }

  //Movable이라는 인터페이스는 두 가지 추상 메소드를 가지고 있음
  private static void moveSomething(Movable movable){
    movable.move();
    movable.fly();
  }

}
