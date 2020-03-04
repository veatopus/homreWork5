package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(600, 100, "Magic");
        boss.printInfo();
        createHeroes();
    }

    public static Hero[] createHeroes() {
        Hero[] arrayHero = new Hero[3];
        Hero hero = new Hero(200, 50, "Magic");
        hero.printInfo();
        arrayHero[0] = hero;
        Hero hero1 = new Hero(150, 100);
        hero1.secondPrintInfo();
        arrayHero[1] = hero1;
        Hero hero2 = new Hero(100, 150, "Stamina");
        hero2.printInfo();
        arrayHero[2] = hero2;
        return arrayHero;
    }
}