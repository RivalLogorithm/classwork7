package ru.liga.education.fish;


import ru.liga.education.LayEggs;

public class Moray extends Fish implements LayEggs {
    public static final String name = "Мурена";

    @Override
    public void info(){
        System.out.print(name);
        super.info();
        layEggs();
        swimBy();
        System.out.println();
    }
    @Override
    public void swimBy() {
        System.out.print(" - Умеет плавать с помощью изгибания тела");
    }
}
