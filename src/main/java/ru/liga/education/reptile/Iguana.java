package ru.liga.education.reptile;


import ru.liga.education.LayEggs;

public class Iguana extends Reptile implements LayEggs {
    public static final String name = "Игуана";

    @Override
    public void info() {
        System.out.print(name);
        super.info();
        layEggs();
        System.out.println();
    }
}
