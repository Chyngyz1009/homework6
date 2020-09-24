package com.company;

public class Main {

    private static Object Boss1;

    public static void main(String[] args) {

        Boss boss1 = new Boss();
        boss1.setHealth(100);
        boss1.setAtack(120);
        boss1.setWeapon1("avtomaticKalashnikova", "gun");

        System.out.println(boss1.getHealth()+ " "+ boss1.getAtack()+  "  "+boss1.getWeapon1());


    }
}
