package com.masai;

public abstract class Animal {

	private String name;

	//abstract method
	public abstract void makeNoise();
	
	//concrete method
	public void sleep() {
		System.out.println(name+" is sleeping !");
	}
	
	//abstract method
	public abstract void eat();
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
