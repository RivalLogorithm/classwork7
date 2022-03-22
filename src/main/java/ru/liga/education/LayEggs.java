package ru.liga.education;

public interface LayEggs {
    default void layEggs() {
        System.out.print(" - Может откладывать яйца");
    }
}
