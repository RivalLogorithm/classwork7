package ru.liga.education.bird;

import ru.liga.education.Flyable;
import ru.liga.education.Vertebrates;

public class Bird extends Vertebrates implements Flyable {
    public static final String name = "Птицы";
    public static final int vertebrates = 45;

    public void info(){
        System.out.print(" - " + name);
        System.out.print(" - ");
        numberOfVertebrae(vertebrates);
        System.out.print(" - ");
    }

    @Override
    public void flyBy() {
        System.out.print("Умеет летать ");
        System.out.print("с помощью взмаха крыльев");
    }
}
