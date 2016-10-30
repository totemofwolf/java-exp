package com.runoob.wanglang.oo.itfc;

// interface Animal();
// class Mammal implements Animal;
// Java只支持单继承，也就是说，一个类不能继承多个类

public class Dog extends Mammal {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		Dog d = new Dog();
		
		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Animal);
	}
}
