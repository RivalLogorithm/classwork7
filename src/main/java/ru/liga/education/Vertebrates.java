package ru.liga.education;

import ru.liga.education.bird.Bird;
import ru.liga.education.fish.Fish;
import ru.liga.education.mammal.FourLegs.FourLegs;
import ru.liga.education.mammal.Mammal;
import ru.liga.education.mammal.TwoLegs.TwoLegs;
import ru.liga.education.reptile.Reptile;

public abstract class Vertebrates {
    public static void numberOfVertebrae(int vertebrates) {
        System.out.print(" - Количество позвонков " + vertebrates);
    }

    public static void printAnimalInfo(Vertebrates... vertebrates) {
        for (Vertebrates vertebrate : vertebrates) {
            if (vertebrate instanceof Bird) {
                ((Bird) vertebrate).info();
                System.out.print(" - " + Bird.name);
                numberOfVertebrae(Bird.vertebrates);
            }
            if (vertebrate instanceof Fish) {
                ((Fish) vertebrate).info();
                System.out.print(" - " + Fish.name);
                numberOfVertebrae(Fish.vertebrates);
            }
            if (vertebrate instanceof Mammal) {
                final Mammal mammal = (Mammal) vertebrate;
                mammal.info();
                if (mammal instanceof TwoLegs) {
                    System.out.print(" - " + TwoLegs.name);
                }
                if (mammal instanceof FourLegs) {
                    System.out.print(" - " + FourLegs.name);
                }
                System.out.print(" - " + Mammal.name);
                numberOfVertebrae(Mammal.vertebrates);
            }
            if (vertebrate instanceof Reptile) {
                ((Reptile) vertebrate).info();
                System.out.print(" - " + Reptile.name);
                numberOfVertebrae(Reptile.vertebrates);
            }
            if (vertebrate instanceof DropTail) {
                ((DropTail) vertebrate).dropTail();
            }
            if (vertebrate instanceof Flyable) {
                ((Flyable) vertebrate).flyBy();
            }
            if (vertebrate instanceof LayEggs) {
                ((LayEggs) vertebrate).layEggs();
            }
            if (vertebrate instanceof Swimable) {
                ((Swimable) vertebrate).swimBy();
            }
            System.out.println();
        }
    }
}
