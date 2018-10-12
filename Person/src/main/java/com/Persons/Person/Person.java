package com.Persons.Person;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobtitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobtitle;
		
	}

	public void printNameandJobTitle() {
		System.out
				.println("The person's name is " + name + ", their age is " + age + " and they work as a " + jobTitle);
	}

	public void listOfPeople() {
		List<Object> listPeople = new ArrayList<Object>();
	}

	public static void searchPerson(List<Person> list, String name) {
		Person result = null;

		for (Person person : list) {
			if (name.equals(person.name)) {
				result = person;
			}
		}
		System.out.println(result);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "" + age + "" + jobTitle;
	}

}
