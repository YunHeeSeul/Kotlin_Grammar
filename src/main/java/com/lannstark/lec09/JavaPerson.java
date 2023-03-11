package com.lannstark.lec09;

public class JavaPerson {

  private final String name;
  private int age;

  public JavaPerson(String name, int age) {
    //나이 검증 코드
    //일반적으로 검증은 클래스 생성 시점에 해주니까 생성자에 검증 로직 짬
    if (age <= 0) {
      throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다", age));
    }
    this.name = name;
    this.age = age;
  }

  //또 다른 생성자
  public JavaPerson(String name) {
    //기존에 있는 생성자 호출
    this(name, 1);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isAdult() {
    return this.age >= 20;
  }

}

