package x1A.chapter;

import java.util.HashMap;

import x1A.chapter.description.Feature;

public class Person {
	String name;
	int age;
	HashMap<Feature, Integer> features;

	public Person(String name, int age, Feature... features) {
		this.name = name;
		this.age = age;

	}

	// Get a description of the person based on features
	public String getDescription() {

		return name;

	}
}