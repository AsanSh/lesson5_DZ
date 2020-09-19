package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superPower;

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

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public Hero() {
    }

    public Hero(int health, String superPower, int damage) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;

    }
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
}
