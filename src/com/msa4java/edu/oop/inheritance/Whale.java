package com.msa4java.edu.oop.inheritance;

public class Whale extends Mammal {

    public Whale(String name, String residence){

//      super 생략되어있음.
//      super 을 통해, 해당 부모의 생성자를 호출하면, 자식의 이름도 생성됨
        super(name, residence);
    }


    @Override
    public void breath() {
        // super : 부모클래스로 부터 상속받은 필드나 메소드를 자식클래스가
        // 참조하기 위해 사용하는 참조변수
        super.breath();
        System.out.println(this.name + "이/가 폐호흡을 하고 숨을 잘 참습니다");
    }


    public void swimming() {
        System.out.println(this.name + "이/가 헤엄 칩니다.");
    }
}
