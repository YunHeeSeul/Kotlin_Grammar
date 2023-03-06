package com.lannstark.lec05;

import java.util.Random;

public class Lec05Main {
  //1. if문
  private void validateScoreIsNotNegative(int score){
    if(score < 0){
      throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.", score));
    }
  }

  private String getPassOrFail(int score){
    if(score >= 50){
      return "P";
    }
    else{
      return "F";
    }
  }

  private String getGrade(int score) {
    if (score >= 90){
      return "A";
    } else if (score >= 80){
      return "B";
    } else if (score >= 70){
      return "C";
    } else {
      return "D";
    }
  }

  public static void main(String[] args) {
  }

  private void judgeNumber2(int number) {
    if (number == 0) {
      System.out.println("주어진 숫자는 0입니다");
      return;
    }

    if (number % 2 == 0) {
      System.out.println("주어진 숫자는 짝수입니다");
      return;
    }

    System.out.println("주어지는 숫자는 홀수입니다");
  }

}
