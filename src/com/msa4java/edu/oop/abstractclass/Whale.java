package com.msa4java.edu.oop.abstractclass;

public class Whale extends Mammal implements Swim{

    public Whale(String name){
        super(name,"바다");

    }

    @Override
    public void residence(){
        // 강사님이 현업에서 쓰는 코드(바로 아래)
        //String result = String.format("%s %s에 삽니다", this.name, this.residence);
        System.out.println(this.name + "는 "+this.residence+"에 삽니다");
    }

    @Override
    public void breath(){
        System.out.println("고래가 숨을 쉼니다123.");
    }

    public void swimming(){
        System.out.println(this.name + " 육중하게 헤엄 칩니다.");
    }
}
