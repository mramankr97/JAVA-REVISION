package com.masai;

public class Main {

	public static void main(String[] args) {
		
//		Animal c=new Cat();
//		c.eat();
//		c.makeNoise();
//		
//		Animal d=new Dog();
//		d.eat();
//		d.makeNoise();
		
		Cat cat=new Cat();
		cat.jump();
		cat.eat();
		cat.makeNoise();
		cat.sleep();
		
		System.out.println("======================================");
		
		Dog dog=new Dog();
		dog.play();
		dog.sleep();
		dog.eat();
		dog.makeNoise();
	}

}
