package com.msa4java.edu.oop;

public class Overloading {
    // 오버로딩
    // "메소드의 시그니처"가 다르나, 동일한 이름을 가지는 메소드를 중복하여 정의
    // 메소드 시그니처: 메소드 선언부에 명시되는 파라미터들의 리스트
    // 오버로딩은, 즉 파라미터의 형태가 다르다는것
    public void print() {
        System.out.println("파라미터 없음");
    }

    // 함수 이름만 같으면 되고, 리턴타입은 달라도 됨
    // 1. 파라미터의 타입이 다름
    public void print(char c){
        System.out.println("파라미터 케릭터 : "+c);
    }



    // 2. 파라미터의 개수가 다른것
    public void print(int a, int b){
        int sum = a + b;
        System.out.println("두개 더한 값 : "+sum);
    }
}
