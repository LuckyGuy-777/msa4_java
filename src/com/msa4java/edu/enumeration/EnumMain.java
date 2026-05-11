package com.msa4java.edu.enumeration;

public class EnumMain {
    public static void main(String[] args) {
        Week day = Week.MONDAY;
        System.out.println(day); //  MONDAY 출력.  출력될때, 내부적으로, .toString() 메서드가 실행되서 값 출력.
        System.out.println(day.name()); //  MONDAY 출력.   .name이, 변수(day) 안의 상수명을 가져옴.
        System.out.println(day.getKrDay()); // 월요일 출력됨

    }
}
