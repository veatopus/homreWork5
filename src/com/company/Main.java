package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(600, 100, "Magic");
        Hero[] arrayHero = new Hero[2];
        arrayHero = createHeroes();
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayHero[i]);
        }
    }

    public static Hero[] createHeroes() {
        Hero[] arrayHero = new Hero[3];
        Hero hero = new Hero(200, 50, "Magic");
        arrayHero[0] = hero;
        Hero hero1 = new Hero(150, 100);
        arrayHero[1] = hero1;
        Hero hero2 = new Hero(100, 150, "Stamina");
        arrayHero[2] = hero2;
        return arrayHero;

    }
}