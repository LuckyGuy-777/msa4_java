package com.msa4java.edu;

public class E01Variable {

    public static void main(String[] args) {
        // 변수 선언
        int age;
        age = 1;
        String name = "홍길동";
        char ch = 'a';


        // 상수 선언
        // 반환값 앞에, final 을 적어주면 됨.
//        final String USER_NAME = "기철이";
//        또는,
//        상수를 선언해두고 값 할당을 딱 1번만 허용함.

//        final String USER_NAME;
//        USER_NAME = "GANADA"; 가능
//        USER_NAME = "RAMABA"; 재 할당 불가능

//        Underscore 표기법
//        서양에서는, 3자리씩 끊어서 읽는다고 함
          int num2 = 200_000_000;

          int swap1 = 1;
          int swap2 = 2;

          int tmp= swap2;
          swap2 = swap1;
          swap1 = tmp;

          System.out.printf("swap1 : %d ,swap2 : %d",swap1,swap2);

          // 데이터 타입
//        primitive type
          boolean boo = false;

//        자바에서 기본 정수형타입을 int라고 인식함.
//        아래의 경우는 byte의 숫자범위를 초과해서 int라고 인식함
//        int 가 자바에서  가장 빠른 정수형 타입이라는 이유로.
          byte bt = -128;

          short st =32767;

          int integer = 2147483647;

//        int타입의 숫자입력범위를 벗어나면, 숫자뒤에 L을 붙여줌
          long longer = 2147483648L;


          double db = 3.141592;

//          float 는, 제일 뒤에, f를 붙여줘야함.
          float ft = 3.141592f;


//          char 는, 한글자만 저장가능, 홑따옴표로 작성해야함
          char ch2 = 'a';

//          위의 데이터타입 외에는 모두 참조형 타입이다.

//        스트링의 비교
        String str1 = "홍길동";
        String str2 = "홍길동";
//        System.out.println(str1 == str2);
//       아래는 자바에서 문자열 속의 값을 비교함.
        System.out.println(str1.equals(str2));



    }
}
