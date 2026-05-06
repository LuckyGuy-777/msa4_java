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
//
//        // 배열의 복사. (for문을 이용한 복사)
//        int[] originArr = {1,2,3};
//        int[] copyArr = new int[originArr.length]; // originArr 의 요소가 복사 되지 않음
//
//        // for 문을 이용한 복사
//        // # double이나 float 이 올때, 강제형변환을 하고, 배열을 돌리거나,
//        // i <= 복사할 배열의 길이-1; i++ 처럼 진행해준다고 함.
//        for(int i = 0; i < originArr.length; i++){
//            copyArr[i] = originArr[i];
//        }
//
//        copyArr[1] = 55;
//        System.out.println(originArr[1]);

        // 배열 복사 메서드
//        System.arraycopy();
//        Arrays.copyOf();  // 내부적으로 System.arraycopy() 를 래핑해서 만들어둔 사용성이 좋은 메소드

        // System.arraycopy() 이용해서 깊은 복사
//        int[] originArr = {1,2,3};
//        int[] copyArr = new int[originArr.length * 2];
//        System.arraycopy(originArr, 0, copyArr, 0, originArr.length);
//        copyArr[1] = 55;
//        System.out.println(copyArr[1]);

        // Arrays.copyof() 이용한 깊은 복사
        int[] originArr = {1,2,3};
        int[] copyArr = new int[originArr.length * 2];
        copyArr =  Arrays.copyOf(originArr, originArr.length);

        copyArr[1] = 55;
        System.out.println(copyArr[1]);

        // 다차원 배열 (게임 & 네트워크 통신분야 에서 자주사용함)
        // 웹개발 에서는 Arraylist 를 사용함.
        int[][] arrMD = {
                {1,2,3}
                ,{4,5,6}
                ,{7,8,9}
        };
        System.out.println(arrMD[2][2]);

        // 배열의 API
        int[] arrInt1 = {1,2,3};
        int[] arrInt2 = {1,2,3};

        // 배열의 길이 반환
        System.out.println(arrInt1.length);

        // 배열이 같은지 비교
        System.out.println(Arrays.equals(arrInt1,arrInt2)); // 두 배열의 주소값을 비교함

        int[][] arrInt1MD1 = {{1,2,3},{4,5,6}};
        int[][] arrInt2MD2 = {{1,2,3,},{4,5,6}};
        System.out.println(Arrays.deepEquals(arrInt1MD1,arrInt2MD2));


        // 배열의 정렬 (코딩테스트 할때 편할꺼라고 함)
        int[] arrSort = {3,4,5,2,11,22,33};
        Arrays.sort(arrSort); // 주의할 점은, 원본이 리턴됨. 반환타입은 void (void면, 배열의 원본이 리턴됨)
        System.out.println(Arrays.toString(arrSort));




    }
}
