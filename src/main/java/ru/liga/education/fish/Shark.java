package ru.liga.education.fish;


public class Shark extends Fish{
    public static final String name = "Акула";

    @Override
    public void info(){
        System.out.print(name);
    }
    @Override
    public void swimBy() {
        System.out.print(" - Умеет плавать с помощью плавников");
    }
}
