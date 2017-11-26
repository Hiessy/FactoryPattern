package com.example.factory;

public class FactoryExample {

	public static void main(String[] args) {		
		PeopleFactory factory = new PeopleFactory();
		Person boy = factory.getPerson(Boy.class);
		Person girl = factory.getPerson(Girl.class);
		
		System.out.println(boy.speak());
		System.out.println(girl.speak());
	}

}
