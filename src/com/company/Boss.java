package com.company;

public class Boss extends GameEntiti {

    private Weapon weapon1=new Weapon();

    public String getWeapon1() {
        return weapon1.getAvtomatic() + weapon1.getKalashnik();
    }

    public void setWeapon1(String avtomaticKalashnikov, String gun) {
        weapon1.setAvtomatic(avtomaticKalashnikov);
        weapon1.setKalashnik(gun);
    }
}
