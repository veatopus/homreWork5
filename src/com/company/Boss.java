package com.company;

public class Boss {
    private int health;
    private int damage;
    private String typeOfProtection;

    public Boss(int health, int damage, String typeOfProtection) {
        this.health = health;
        this.damage = damage;
        this.typeOfProtection = typeOfProtection;

    }

    public void printInfo() {
        System.out.println(
                "---------------------------------------------------\n" +
                        "Здоровье босса: " + getHealth() + "\n" +
                        "Атака босса: " + getDamage() + "\n" +
                        "Тип сопротевления : " + getTypeOfProtection() + "\n" +
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