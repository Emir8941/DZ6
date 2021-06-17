package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setWeapon("AK-47");
        boss.setDamage(45);
        boss.setHealth(100);
        System.out.println("Health:"+boss.getHealth()+""+"Damage:"+ boss.getDamage()+""+"Weapon"+boss.getWeapon());


    }
}
