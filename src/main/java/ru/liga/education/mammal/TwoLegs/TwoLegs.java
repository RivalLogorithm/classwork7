package ru.liga.education.mammal.TwoLegs;

import ru.liga.education.mammal.Mammal;

public abstract class TwoLegs extends Mammal {
    public static final String name = "Двуногие";

    @Override
    public void info() {
        System.out.print(" - " + name);
        super.info();
    }
}
