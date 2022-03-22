package ru.liga.education.reptile;

import ru.liga.education.DropTail;
import ru.liga.education.Vertebrates;

public abstract class Reptile extends Vertebrates implements DropTail {
    public static final String name = "Рептилии";
    protected int vertebrates = 140;

    public void info(){
        System.out.print(" - " + name);
        numberOfVertebrae(vertebrates);
    }
}
