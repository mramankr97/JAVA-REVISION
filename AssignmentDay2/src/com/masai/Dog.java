package com.masai;

public class Dog extends Animal{

	private String breed;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Dog is barking !");
	}
	@Override
	public void eat() {
		System.out.println("Dog is eating !");
	}
	
	public void play() {
		System.out.println("Dog is playing !");
	}
}
