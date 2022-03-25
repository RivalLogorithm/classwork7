package ru.liga.education.reptile;

import ru.liga.education.DropTail;
import ru.liga.education.Vertebrates;

public abstract class Reptile extends Vertebrates implements DropTail {
    public static final String name = "Рептилии";
    public static final int vertebrates = 140;

    public abstract void info();
}
