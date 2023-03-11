package com.lannstark.lec10;

//Animal이란 추상클래스를 구현한 Cat, Penguin
//Cat, Penguin이 하위클래스
public abstract class JavaAnimal {

  protected final String species; //종 필드
  protected final int legCount; //다리 개수 필드

  public JavaAnimal(String species, int legCount) {
    this.species = species;
    this.legCount = legCount;
  }

  abstract public void move();  //추상메소드로 이 동물이 움직이는 move라는 메소드가 있음

  public String getSpecies() {
    return species;
  }

  public int getLegCount() {
    return legCount;
  }

}
