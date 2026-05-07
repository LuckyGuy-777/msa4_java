package com.msa4java.edu.oop.basic;

public class Marine {
    private int hp;  // 체력
    private int damage; // 공격력
    private int armor; // 방어력

    // 메소드 오버로딩
    public Marine() {
        // 이곳의 this는,
        // public Marine(int hp, int damage, int armor) 을 가르킴.
        // Marine에 40,6,0 의 값을 대입함 (아래의 함수에 값이 들어감)
        this(40,6,0);
    }

    public Marine(int hp){
        this(hp, 6,0);
    }

    public Marine(int hp, int damage, int armor){
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    // getter
    public int getHp() {
        return this.hp;
    }

    public int getDamage(){
        return this.damage;
    }

    public int getArmor(){
        return this.armor;
    }

    //setter
    public void setHp(int hp){
        this.hp = hp;
    }

}
