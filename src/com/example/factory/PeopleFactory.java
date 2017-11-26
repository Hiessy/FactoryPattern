package com.example.factory;

public class PeopleFactory {

	public Person getPerson(Class<? extends Person> clazz) {
		try {
			return clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new IllegalArgumentException(e);
		}
	}
}