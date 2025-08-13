package com.qa;
import com.qa.model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat ("Ollie", 2);
		Dog dog = new Dog ("Woofer", 5);
		Rabbit rabbit = new Rabbit ("twitch", 10);
		Cat cat2 = new Cat ("Lola", 15);
		Dog dog2 = new Dog ("Archie", 3);
	
	ArrayList<Animal> farmList= new ArrayList<>();
	farmList.add(cat);
	farmList.add(dog);
	farmList.add(rabbit);
	farmList.add(cat2);
	//can add at a specific index
	farmList.add(1, dog2);
	ArrayList<Cat> catList= new ArrayList<>();
	catList.add(cat);
	//will error as due to being TypeSafe
	//catList.add(dog);
	

	for (Animal animal : farmList) {
		if (animal.getName().contains("Lola")){
			System.out.println("The best one is " + animal.getName());
		}
	}
	
	HashMap<String, Animal> farmMap = new HashMap<>();
	
	//hashmap no order to keys or values
		farmMap.put("5", new Dog("Fido", 5));
		farmMap.put("0", dog);
		farmMap.put(dog2.getName(), dog2);
	
	HashSet<Animal> farmSet = new HashSet<>();
	
	//we can just add all elements of another collection
	farmSet.addAll(catList);
	//hashSet cannot contain dupes so this code will compile but override any dupes
		farmSet.add(cat);
		farmSet.add(new Cat("Belly", 10));
		farmSet.add(cat);
	
	System.out.println("farm arrayList equals" + farmList);
	System.out.println("farmMap equals" + farmMap);
	System.out.println("farmset equals " + farmSet);
	
	//note this uses the compareTo method defined in animals class to display in desc order acc to age
	Collections.sort(farmList);
	System.out.println("farmList sorted by age is " + farmList);
	//display animals in sorted arrayList
	for (Animal animal : farmList) {
		{
			System.out.println("In age order here are the oldest animals " + animal.getName());
		}
	}
	
	}
	

}
