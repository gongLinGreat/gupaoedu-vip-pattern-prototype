package com.gupaoedu.vip.pattern.prototype.monster;

public class WellKnownMonster implements Cloneable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
