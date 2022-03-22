package ru.liga.education.mammal.FourLegs;

import ru.liga.education.mammal.Mammal;

public abstract class FourLegs extends Mammal {
    public static final String name = "Четвероногие";

    @Override
    public void info() {
        System.out.print(" - " + name);
        super.info();
    }
}
