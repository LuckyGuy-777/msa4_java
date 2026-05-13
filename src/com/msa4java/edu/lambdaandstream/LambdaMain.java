package com.msa4java.edu.lambdaandstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMain {
    public static void main(String[] args) {

        MyAddInterface myAddInterface = (a, b) -> a + b;

        myAddInterface.plus(1,2);


        // ------------------------------
        // 스트림
        // ------------------------------
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("둘리");
        list.add("도우너");
        list.add("또치");


        // 1. 리스트를 스트림으로 생성

        // list를 스트림으로 변환해서 사용하는 방법
        // 아래는, 리스트의 각 요소에, 이름을 추가하는 케이스
        Stream<String> stream = list.stream(); // list를 Stream() 으로 변환한 코드
        List<String> newList =stream.map(name -> {
           return "이름 : " + name;
        }).toList(); // 스트림을 구현함, 그리고 .toList(); 로 최종연산을 하게한다음, 변환된 배열을 반환함

        // map은, 배열의 모든요소에 대해, 콜백함수를실행하는 특성을 가짐.

        // 스트림은, for 문으로 대체될 수 있다.

    }

    // 일반적인 메소드.
    public int add(int a, int b){
        return a + b;
    }

    // 위의 메소드를 람다식으로 표현.
    // 자바스크립트의 화살표함수를 배껴온것 이라고함
//    (a, b) -> a + b;




}
