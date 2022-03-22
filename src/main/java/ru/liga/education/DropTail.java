package ru.liga.education;

public interface DropTail {
    default void dropTail(){
        System.out.print(" - Умеет отбрасывать хвост");
    }
}
