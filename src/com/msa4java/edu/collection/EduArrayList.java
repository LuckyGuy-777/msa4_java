package com.msa4java.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EduArrayList {
    public static void main(String[] args) {
//        Array.list
        List<Integer> list = new ArrayList<>( 10 );


        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3));

        Collections.sort(list);
        System.out.println(list.get(3));

        System.out.println(list.size());


        // 향상된 for 문
        for(int i : list){
            System.out.println(i);
        };


        // forEach 문법. (for 반복문과 동일함)
        list.forEach((i) -> {
            System.out.println(i);
        });
    }
}
