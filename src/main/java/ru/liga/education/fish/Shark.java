package ru.liga.education.fish;

import ru.liga.education.Swimable;

public class Shark extends Fish{
    public static final String name = "Акула";

    public void info(){
        System.out.print(name);
        super.info();
        swimBy();
        System.out.println();
    }
    @Override
    public void swimBy() {
        System.out.print("Умеет плавать с помощью плавников");
    }
}
