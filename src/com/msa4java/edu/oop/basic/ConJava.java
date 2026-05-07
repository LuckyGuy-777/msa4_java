package com.msa4java.edu.oop.basic;

public class ConJava {
    public int age;

    // 생성자
    // new 키워드를 통해, 클래스를 인스턴스와 할때, 딱 최초 딱 한번만 실행되는 메서드
    public ConJava(int age) {
//      this.age는, 클래스 내부의 age를 가리킴. -> public int age;
        this.age = age;
        this.test();
    }


    private void test(){
        System.out.println("테스트 실행됨");
    }

}
