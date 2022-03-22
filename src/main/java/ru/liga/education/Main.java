package ru.liga.education;

import ru.liga.education.bird.Albatross;
import ru.liga.education.bird.Seagull;
import ru.liga.education.fish.Moray;
import ru.liga.education.fish.Shark;
import ru.liga.education.mammal.Dolphin;
import ru.liga.education.mammal.FourLegs.Dog;
import ru.liga.education.mammal.TwoLegs.Human;
import ru.liga.education.reptile.Dragon;
import ru.liga.education.reptile.Iguana;

public class Main {

	public static void main(String[] args) {
		Human human = new Human();
		human.info();

		Iguana iguana = new Iguana();
		iguana.info();

		Seagull seagull = new Seagull();
		seagull.info();

		Albatross albatross = new Albatross();
		albatross.info();

		Moray moray = new Moray();
		moray.info();

		Shark shark = new Shark();
		shark.info();

		Dolphin dolphin = new Dolphin();
		dolphin.info();

		Dog dog = new Dog();
		dog.info();

		Dragon dragon = new Dragon();
		dragon.info();
	}
}
