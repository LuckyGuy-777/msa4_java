package com.msa4java.edu.oop.abstractclass;

public class FlyingSquirrel extends Mammal{

    public FlyingSquirrel(String name){
        super(name,"숲");
    }


    @Override
    public void residence(){
        System.out.println(this.name+"는 "+this.residence+"에 삽니다");
    }

}
