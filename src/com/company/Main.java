package com.company;

public class Main {

    private static Object Boss1;

    public static void main(String[] args) {

        Boss boss1 = new Boss();
        Weapon weapon=new Weapon();
        weapon.setKalashnik("gygkhgkj");
        weapon.setAvtomatic("ggu");
        boss1.setHealth(100);
        boss1.setAtack(120);
        boss1.setWeapon1(weapon);


        System.out.println(boss1.getHealth()+ " "+ boss1.getAtack()+  "  "+weapon.getKalashnik()+" "+weapon.getAvtomatic());


    }
}
