package com.lannstark.lec08;

public class Lec08Main {

  public static void main(String[] args) {

  }

  //1. 함수 선언 문법
  public int max(int a, int b){
    if (a>b) return a;
    return b;
  }


  //2. default parameter
  public void repeat(String str, int num, boolean useNewLine){
    for (int i=1; i<=num; i++){
      if (useNewLine) {
        System.out.println(str);
      }else{
        System.out.println(str);
      }
    }
  }
  //오버로딩
  public void repeat(String str, int num){ //기본값을 true로
    repeat(str, num,true);
  }
  public void repeat(String str){ //기본값을 true와 3으로
    repeat(str, 3,true);
  }


  //4. 같은 타입의 여러 파라미터 받기
  //타입... 을 쓰면 Java에서는 가변인자를 쓰는구나라고 이해했음
  public static void printAll(String... strings) {
    for (String str : strings) {
      System.out.println(str);
    }
  }

}
