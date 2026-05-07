package com.msa4java.edu.oop.basic;

public class MainOOP {
    public static void main(String[] args) {

        // static 은, 메모리 상에서, 다른 공간에 저장된다

        // 패키지가 다른 곳에서 클래스를 가져오려면,
        // 임포트를 해야한다.
        // Whale 클래스를 인스턴스 생성
        // 클래스 이름은 첫글자가 대문자. 인스턴스 이름은 모든글자가 소문자임
//        Whale whale = new Whale();
//        System.out.println();
//
//        // 객체로 된것들은 . 으로 접근해서 사용함
//        whale.swimming();
//        System.out.println(whale.name = "고래");

        // static은, 자바프로그램이 시작할때, 메모리에 올라감
        // 프로그램이 종료될떄 메모리에서 사라짐
        // static은, 캡슐화가 불가능, 모든 메소드를 static으로 쓰면, 메모리 소모가 큼
        System.out.println(Whale.age); // static 멤버에 접근

        // static 을  사용하면, 기본적으로 인스턴스 생성없이도, 메소드에 접근가능함
        //Whale.swimming();

        Whale.breath(); // static 멤버에 접근


        // 접근제어지시자 확인용
        AccessModifier accessModifier = new AccessModifier();


        // 오버로딩 테스트
        Overloading overloading = new Overloading();
        overloading.print('a');
        overloading.print(1,2);


        // 생성자
        ConJava conJava1 = new ConJava(3);
        ConJava conJava10 = new ConJava(30);

        System.out.println(conJava1.age+" "+conJava10.age);

        Marine marine = new Marine(40, 6,0);
        System.out.println(marine.getHp());
        marine.setHp(1000);
        System.out.println(marine.getHp());


        Marine marine2 = new Marine();
        System.out.println(marine2);

    }
}
