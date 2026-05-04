package com.msa4java.edu;

public class E02Operator {
    public static void main(String[] args) {
        //산술연산자
        int num1 = 5;
        int num2 = 10;

        int sum = num1 + num2;
        System.out.println(sum);
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        System.out.println(divide);
        int mod = num1 % num2;
        System.out.println(mod);


        // 산술대입연산자
        num1 +=1;
        num1 -=1;
        num1 *= 5;
        num1 /= 5;
        num1 %= 2;


        // 비교연산자
        // 두 값을 비교해서, true,false를 반환하는 연산자
        num1 = 1;
        num2 = 2;
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2); // 완전비교연산자
        System.out.println(num1 != num2);


        // 문자열 비교
        // 비교연산자로 문자열을 비교하면 안됨
        String str = "자바";
        System.out.println(str.equals("테스트"));


        // 논리 연산자 and &, or | , not ! 연산자
        System.out.println(num1 == num2 && num1 > 3);
        System.out.println(num1 == num2 || num1 > 3);
        System.out.println(!(num1 == num2));

        // 삼항연산자
        // 조건식 ? 참 일경우 : 거짓일 경우;
        String result = num1 > num2 ? "num1이 큼" : "num2이 큼";
        System.out.println(result);
    }
}
