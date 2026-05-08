package com.msa4java.edu.generics;

import java.util.Arrays;

public class GenericsMain {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.add(2);
        box1.add(5);

        System.out.println(Arrays.toString((box1.arr)));

        // 외부에서 지정한 데이터타입에 따라서, 배열의 타입을
        // 결정할 수 있음.
        Box2<String> box2 = new Box2<String>();
        box2.add("test");


        Box2<Integer> box2Int = new Box2<Integer>();
        box2Int.add(1);
    }
}
