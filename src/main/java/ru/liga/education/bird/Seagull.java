package ru.liga.education.bird;


public class Seagull extends Bird{
    public static final String name = "Чайка";

    public void info(){
        System.out.print(name);
        super.info();
        flyBy();
        System.out.println();
    }
}
