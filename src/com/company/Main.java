package com.company;

import java.util.Arrays;

public class Main {

    /*
    Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
    Написать 2 разных конструктора для создания объекта.
    В одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.!!!!!!!!

    Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты. Добавить в класс геттеры и сеттеры для всех полей.
    В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию о боссе.

    ДЗ на сообразительность:
    Добавить метод в классе Main который называется createHeroes, в теле метода необходимо создать 3х героев с помощью класса Hero,
    используя при этом разные варианты конструкторов (либо первый либо второй).
    Затем поместить созданные экземпляры героев в массив и
    вернуть его с помощью команды return, как возвращаемый результат метода createHeroes.

    Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
    Дэдлайн 20.09.2020 23 59
    */

    public static void main(String[] args) {
        Hero hulk = new Hero();
        hulk.setDamage(100);
        hulk.setHealth(200);
        hulk.setSuperPower("Magic");
        System.out.println(hulk.getDamage() + " " + hulk.getHealth() + " " + hulk.getSuperPower());

        Hero tanos = new Hero(12, "Magic", 120);
        System.out.println(tanos.getHealth() + " " + tanos.getSuperPower() + " " + tanos.getDamage());
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        Hero thor = new Hero(200, 500);
        System.out.println(thor.getHealth() + " " + thor.getDamage());
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        Boss superMan = new Boss();
        superMan.setDamage(900);
        superMan.setHealth(999);
        superMan.setDefence("immortal");
        System.out.println(superMan.getHealth() + " " + superMan.getDamage() + " " + superMan.getDefence());

        Hero[] newMass;
        newMass = createHeroes();
        System.out.println(Arrays.toString(newMass));
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        tanos = createHeroes()[0];
        System.out.println(tanos);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }
    public static Hero[] createHeroes() {
        System.out.println("Герой _ 1 _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        Hero hero1 = new Hero(100, "Strenght", 500);
        System.out.println(hero1.getHealth() + " " + hero1.getSuperPower() + " " + hero1.getDamage());

        System.out.println("Герой _ 2 _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        Hero hero2 = new Hero(300, "Magic", 1000);
        System.out.println(hero2.getHealth() + " " + hero2.getSuperPower() + " " + hero2.getDamage());

        System.out.println("Герой _ 3 _-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        Hero hero3 = new Hero(2000, 1500);
        System.out.println(hero3.getHealth() + " " + hero3.getDamage());

        Hero[] allHeroes = {hero1, hero2, hero3};
        System.out.println(allHeroes[0]);
        return allHeroes;
    }
}




