package ru.liga.education.bird;

import ru.liga.education.Flyable;
import ru.liga.education.LayEggs;
import ru.liga.education.Vertebrates;

public abstract class Bird extends Vertebrates implements Flyable, LayEggs {
    public static final String name = "Птицы";
    public static final int vertebrates = 45;

    public abstract void info();

    @Override
    public void flyBy() {
        System.out.print(" - Умеет летать с помощью взмаха крыльев");
    }
}
