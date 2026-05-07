package com.msa4java.edu.oop.abstractclass;

public class AbstractMain {

    public static void main(String[] args) {
        Whale whale = new Whale("고래");
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel("날다람쥐");


        whale.residence();
        flyingSquirrel.residence();

        whale.swimming();


        // 다형성
        /* 같은 자료형에 여러가지 타입의 데이터를 대입하여,
        *  다양한 결과를 얻어낼수 있는 성질. */
        // 자식클래스의 부모타입을 타입으로 가질수 있다.
        // Whale 클래스가 Mammal 클래스를 상속받았기에, 아래와 같은 표현이 가능하다.
        // Whale 클래스가 Mammal 클래스의 형태를 띌수 있다.
        Whale whale2 = new Whale("고래2"); // 업캐스팅 예시. Whale 클래스가 Mammal 타입 형을 가짐
        Mammal castingWhaleToMammal = (Mammal) whale2; // 업캐스팅. (자식클래스가 부모클래스의 형태를 띄고있기에.)
        whale2.swimming();
        //castingWhaleToMammal.swimming(); // 업캐스팅이 된 경우에는, 자식클래스가 가진 멤버에는 접근이 불가능하다.
        whale2.breath();

        // 업케스팅 됬다면,
        // 자식쪽에서 오버라이딩된 메소드는, 부모쪽 메소드에 덮어씌워짐
        castingWhaleToMammal.breath();


        // 다운케스팅
        // 한번이라도 업케스팅 했던 객체를, 다시 자기 클래스로 되돌리기 위해서 사용
        // 업캐스팅한 인스턴스를 다시 자기의 데이터타입으로 캐스팅 하는것
        Whale downCastingWhale = (Whale)castingWhaleToMammal;
        downCastingWhale.swimming();

        // Whale과, FlyingSquirrel 의 부모클래스면 아래처럼 사용가능.
        // 라이브러리를 만들때는, 아래처럼 사용됨.
        Mammal[] arrMammal = new Mammal[4];
        arrMammal[0] = new Whale("고래1");
        arrMammal[1] = new Whale("고래2");
        arrMammal[2] = new Whale("고래3");
        arrMammal[3] = new FlyingSquirrel("날다람쥐");

        for(int i = 0; i < arrMammal.length; i++){
            // 루프를 한번돌때마다, 배열안의, 그 다음번 Mammal 요소를 가져옴
            Mammal obj = arrMammal[i];


            // 아래와 같은 경우에 사용함
            // instanceof 로 데이터타입 체크
            if(obj instanceof Whale){
                Whale whale3 = (Whale) obj;
                whale3.swimming();
            } else if (obj instanceof  FlyingSquirrel) {
                FlyingSquirrel flyingSquirrel3 = (FlyingSquirrel) obj;
                flyingSquirrel3.residence();
            }
        }

    }
}
