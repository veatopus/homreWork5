package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superpower;

    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
        System.out.println(
                        "---------------------------------------------------\n" +
                        "Здоровье героя: " + this.health + "\n" +
                        "Атака героя: " + this.damage + "\n" +
                        "Суперспособность героя: " + this.superpower + "\n" +
                        "---------------------------------------------------");
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        System.out.println(
                        "---------------------------------------------------\n" +
                        "Здоровье героя: " + this.health + "\n" +
                        "Атака героя: " + this.damage + "\n" +
                        "---------------------------------------------------");
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}
