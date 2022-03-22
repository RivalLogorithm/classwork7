package ru.liga.education.mammal;

import ru.liga.education.Vertebrates;

public abstract class Mammal extends Vertebrates {
    public static final String name = "Млекопитающие";
    public static final int vertebrates = 32;

    public void info() {
        System.out.print(" - " + name);
        System.out.print(" - ");
        numberOfVertebrae(vertebrates);
        System.out.println();
    }
}
