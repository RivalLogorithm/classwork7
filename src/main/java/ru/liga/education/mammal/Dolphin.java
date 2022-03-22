package ru.liga.education.mammal;

import ru.liga.education.Swimable;

public class Dolphin extends Mammal implements Swimable {
    public static final String name = "Дельфин";

    @Override
    public void info() {
        System.out.print(name);
        super.info();
        swimBy();
        System.out.println();
    }

    @Override
    public void swimBy() {
        System.out.print(" - Умеет плавать с помощью плавников");
    }
}
