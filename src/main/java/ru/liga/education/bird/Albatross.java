package ru.liga.education.bird;

public class Albatross extends Bird{
    public static final String name = "Альбатрос";

    public void info(){
        System.out.print(name);
        super.info();
        flyBy();
        System.out.println();
    }
}
