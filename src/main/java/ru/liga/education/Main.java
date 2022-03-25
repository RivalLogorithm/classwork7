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
		Vertebrates.printAnimalInfo(
				new Human(),
				new Iguana(),
				new Seagull(),
				new Albatross(),
				new Moray(),
				new Shark(),
				new Dolphin(),
				new Dog(),
				new Dragon());
//		Human human = new Human();
//
//		Iguana iguana = new Iguana();
//
//		Seagull seagull = new Seagull();
//
//		Albatross albatross = new Albatross();
//
//		Moray moray = new Moray();
//
//		Shark shark = new Shark();
//
//		Dolphin dolphin = new Dolphin();
//
//		Dog dog = new Dog();
//
//		Dragon dragon = new Dragon();
	}
}
