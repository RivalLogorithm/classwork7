package ru.liga.education.reptile;


public class Iguana extends Reptile {
    public static final String name = "Игуана";

    public void info() {
        System.out.print(name);
        super.info();
    }
}
