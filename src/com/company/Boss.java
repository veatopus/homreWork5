package com.company;

public class Boss {
    private int health;
    private int damage;
    private String typeOfProtection;

    public Boss(int health, int damage, String typeOfProtection) {
        this.health = health;
        this.damage = damage;
        this.typeOfProtection = typeOfProtection;
        System.out.println(
                "---------------------------------------------------\n" +
                        "Здоровье босса: " + this.health + "\n" +
                        "Атака босса: " + this.damage + "\n" +
                        "Тип сопротевления : " + this.typeOfProtection + "\n" +
                        "---------------------------------------------------");

    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getTypeOfProtection() {
        return typeOfProtection;
    }
}