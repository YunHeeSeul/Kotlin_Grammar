package com.lannstark.lec10;

public class JavaCat extends JavaAnimal {

  public JavaCat(String species) {
    //생성자는 species 하나만 받음
    super(species, 4); //다리 개수 입력해줌
  }

  @Override
  public void move() {
    System.out.println("고양이가 사뿐 사뿐 걸어가~");
  }

}

