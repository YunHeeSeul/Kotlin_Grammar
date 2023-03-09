package com.lannstark.lec07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter {

  //2. checked/unchecked exception
  //close 구문이나 아니면 readline 구문이나 FileReader을 만드는 구문이나 이런 것들이 IOException을 뱉어내기 때문에 예외처리 해줘야 함
  public void readFile1() throws IOException {

    File currentFile = new File("."); //파일 객체를 만들어서 현대 파일의 위치를 찾은 후 => 현재 위치를 의미하는 .을 찍어줌

    //절대 위치를 기준으로 a.txt라는 파일을 가져옴.
    //최상단에 위치해있기 때문에 최상단단 absolute path를 가져오기 위해 currentFile을 만듦.
    //위치는 currentFile의 absolute path에다가 a.txt까지 더해줌
    //이렇게 되면 이 파일은 a.txt를 가리키게 됨
    File file = new File(currentFile.getAbsolutePath() + "/a.txt");

    //그 다음 BufferedReader을 만들어서 그 파일을 읽어주고
    BufferedReader reader = new BufferedReader(new FileReader(file));

    //Buffer를 통해서 한 줄을 읽은 다음 그 결과물을 출력
    System.out.println(reader.readLine());

    //외브 리소스를 사용했으니 닫아줌
    reader.close();
  }

  //3. try with resources
  public void readFile(String path) throws IOException{
    //이번엔 직접 경로를 받아옴.
    //try 괄호 안에 외부 자원을 만들어주고 try가 끝나면 자동으로 이 외부자원을 닫아주는 try with resource 구문
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      System.out.println(reader.readLine());
    }
  }
}

