package ru.liga.education.mammal;

public class Human extends Mammal{
    public static final String name = "Человек";

    public void info(){
        System.out.print(name);
        super.info();
    }
}
