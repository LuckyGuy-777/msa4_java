package com.msa4java.edu.oop;

public class AccessModifier {
    // 접근 제어 지시자 : 외부에서의 접근을 통제하기 위해 필드 또는 메소드
    // 앞에 작성하는 키워드.
    public int numPublic = 1; // 내&외부 어디서나 접근가능함
    protected int numProtected = 2; // 같은패키지& 클래스내부 &자식클래스 에서 접근가능 (상속관계에서만 접근가능하게 하겠다 할때 사용)
    private int numPrivate = 3; // 클래스 내부에서만 접근가능함
    int numDefault = 4; // 같은 패키지에 소속된 클래스에서 접근가능 ,접근제어 지시자 default 는 표기를 생략함.

}
