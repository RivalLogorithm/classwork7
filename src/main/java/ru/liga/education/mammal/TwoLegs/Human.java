package ru.liga.education.mammal.TwoLegs;

public class Human extends TwoLegs {
    public static final String name = "Человек";

    @Override
    public void info(){
        System.out.print(name);
        super.info();
        System.out.println();
    }
}
