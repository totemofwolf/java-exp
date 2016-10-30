package com.runoob.w0ng.oo.sup;

class Animal {
	
	public void move() {
		System.out.println("动物可以动");
	}
}

class Dog extends Animal {
	public void move() {
//		调用super类的方法
		super.move();
		System.out.println("狗🐶可以跑和走");
	}
}

public class TestDog {

	public static void main(String[] args) {
// Dog对象
		Animal b = new Dog();
//		Dog b = new Dog();
		b.move();
	}
}
