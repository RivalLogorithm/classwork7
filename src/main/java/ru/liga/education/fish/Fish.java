package ru.liga.education.fish;

import ru.liga.education.Swimable;
import ru.liga.education.Vertebrates;

public abstract class Fish extends Vertebrates implements Swimable {
    public static final String name = "Рыбы";
    public final static int vertebrates = 70;

    public void info(){
        System.out.print(" - " + name);
        numberOfVertebrae(vertebrates);
    }
}
