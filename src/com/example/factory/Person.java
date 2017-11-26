package com.example.factory;

public interface Person {
	public default String speak(){
		return ("I'm a person, who is also a: " + this.getClass());
	}
}