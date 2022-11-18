package com.masai;

public class Cat extends Animal{

	private String nickName;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String nickName) {
		super();
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public void makeNoise() {
		System.out.println("Cat is making noise!");
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating!");
	}
	
	public void jump() {
		System.out.println("Cat is jumping!");
	}
}
