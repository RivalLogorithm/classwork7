package ru.liga.education.mammal.FourLegs;

public class Dog extends FourLegs {
    public static final String name = "Собака";

    @Override
    public void info(){
        System.out.print(name);
    }
}
