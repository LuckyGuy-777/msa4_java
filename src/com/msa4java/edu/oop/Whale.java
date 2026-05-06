// 이 패키지는, 클래스의 주소 라고 여긴다.
package com.msa4java.edu.oop;

// 클래스 이름은, 파스칼 기법으로 작성해야한다
// 그리고, 파일이름과 클래스명이 동일해야한다
// 클래스명 이 중복되지 말아야한다.
// 중복되더라도, 다른패키지 이여야 한다

public class Whale {

    // 클래스의 구성요소
    // 1, 변수(프로퍼티), 2. 메소드(함수)
    // # 클래스는, 필드(변수)와 메소드로 구성되어 있다.


    public String name = "고래"; // 필드
    public static int age = 20; // static 으로 선언된 변수를 클래스변수 라고함

    //메소드
    public void  swimming(){
        // static 변수에 접근이 안됨  this.age
        System.out.println("고래가 헤엄칩니다.");
    }

    public static void breath() {
//        static 메소드에서는, this 가 쓰일수 없음.
        System.out.println("고래가 호흡을 합니다.");
    }

}
