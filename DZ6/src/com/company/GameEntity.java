package com.company;

public class GameEntity {
    public String bigBrat;

    public String getBigBrat() {
        return bigBrat;
    }

    public void setBigBrat(String bigBrat) {
        this.bigBrat = bigBrat;
    }

    public String getMedical() {
        return medical;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }

    public String medical;
    public int health;
    public int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
