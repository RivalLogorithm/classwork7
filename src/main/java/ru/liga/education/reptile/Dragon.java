package ru.liga.education.reptile;

import ru.liga.education.DropTail;
import ru.liga.education.Flyable;

public class Dragon extends Reptile implements Flyable, DropTail {
    public static final String name = "Летучий дракон";

    @Override
    public void info() {
        System.out.print(name);
    }

    @Override
    public void flyBy() {
        System.out.print(" - Умеет летать с помощью планирования на перепонках");
    }
}
