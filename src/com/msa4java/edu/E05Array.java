package com.msa4java.edu;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {

//      길이 5의 int배열 생성 및 초기화
        int[] arrInt = new int[5];

        int[] ary = {1,2,3,4};

//      문자로 배열을 만들자
//      길이 4의 char배열 생성 및 초기화(요소의 값도 세팅)
        char[] arrChar = {'a','b','c','d'};

//        Arrays객체의 toString을 해주면, 배열내부의 값을 표현해줌
        System.out.println(Arrays.toString(arrInt));

        for(int i = 0; i<ary.length; i++){
            System.out.println(ary[i]);
        }


    }
}
