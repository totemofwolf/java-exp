package com.runoob.w0ng.oo;

// 通过使用关键字extends，子类可以继承父类所有的方法和属性，但是无法使用 private(私有) 的方法和属性
public class Dog extends Mammal {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Mammal m = new Mammal();
		
		Dog d = new Dog();

//		super class
		System.out.println(a instanceof Object);
		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Animal);
	}
}
