package ru.liga.education.fish;


public class Moray extends Fish{
    public static final String name = "Мурена";

    public void info(){
        System.out.print(name);
        super.info();
        swimBy();
        System.out.println();
    }
    @Override
    public void swimBy() {
        System.out.print("Умеет плавать с помощью изгибания тела");
    }
}
