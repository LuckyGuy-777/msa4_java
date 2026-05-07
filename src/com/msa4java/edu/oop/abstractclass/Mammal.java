package com.msa4java.edu.oop.abstractclass;

public abstract class Mammal {
    protected String name;
    protected String residence;

    public Mammal(String name, String residence){
        this.name = name;
        this.residence = residence;
    }

    public void breath(){
        System.out.println(this.name+"폐호흡 합니다.");
    }

    // 추상메서드 : 반드시 구현을 해야하는 강제장치 역할을 하게한다
    public abstract void residence();

}
