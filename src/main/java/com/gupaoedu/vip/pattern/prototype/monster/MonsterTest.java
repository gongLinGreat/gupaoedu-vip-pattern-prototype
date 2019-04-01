package com.gupaoedu.vip.pattern.prototype.monster;

public class MonsterTest {

    public static void main(String[] args) {

        WellKnownMonster wellKnownMonster = new WellKnownMonster();
        wellKnownMonster.setName("小怪兽");
        System.out.println("wellKnownMonster :" + wellKnownMonster);

        WellKnownMonster copy = null;
        try {
            copy = (WellKnownMonster)wellKnownMonster.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("copy             :" + copy);
        System.out.println("克隆对象与原值是否一致：" + (wellKnownMonster == copy));

        System.out.println("克隆对象与原值名字是否一致：" + (wellKnownMonster.getName() == copy.name));
    }
}
