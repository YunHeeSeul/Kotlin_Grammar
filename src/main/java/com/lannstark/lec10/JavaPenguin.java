package com.lannstark.lec10;

//인터페이스를 implement
public final class JavaPenguin extends JavaAnimal implements JavaSwimable, JavaFlyable {

  private final int wingCount;

  public JavaPenguin(String species) { //생성자에서는 species만 받고
    super(species, 2);
    this.wingCount = 2;//존재하는 필드의 wingcount의 값을 2라고 바로 넣어줌
  }

  @Override
  public void move() {
    System.out.println("펭귄이 움직입니다~ 꿱꿱");
  }

  @Override
  public int getLegCount() {
    //상위클래스의 getter를 override해서 상위클래스가 가지고 있는 legcount와 내가 가지고 있는 wingcount를 더한 값을 리턴
    return super.legCount + this.wingCount;
  }

  @Override
  public void act() {
    JavaSwimable.super.act();
    JavaFlyable.super.act();
  }

}
