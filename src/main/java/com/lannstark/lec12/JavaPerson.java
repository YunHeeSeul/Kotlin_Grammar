package com.lannstark.lec12;

public class JavaPerson {

  //1. static 변수와 함수
  //static 변수
  private static final int MIN_AGE = 1;

  //정적 팩토리 메소드라 불리는 static 함수
  public static JavaPerson newBaby(String name) {

    return new JavaPerson(name, MIN_AGE);
  }

  private String name;

  private int age;

  private JavaPerson(String name, int age) {
    this.name = name;
    this.age = age;
  }

}

