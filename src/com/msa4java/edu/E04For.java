package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
//        for(int i = 2; i<10; i++){
//            System.out.println("** "+i+"단 **");
//            for(int j = 1; j < 10; j++){
//                System.out.printf("%d x %d = %d\n", i,j,i*j);
//            }
//        }

        int dan = 2;

        for(int i = dan; i<=9; i++){
            String strDan = String.format("** %d단 **",i);
            System.out.println(strDan);
            for(int z = 1; z <= 9; z++){
                String strMulti = String.format("%d x %d = %d", i,z,i*z);
                System.out.println(strMulti);
            }
        }


    }
}
