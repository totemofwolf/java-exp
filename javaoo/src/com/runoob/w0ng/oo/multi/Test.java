package com.runoob.w0ng.oo.multi;
/**
 * 
 * @author w0ng
 * 多态三要素：
 * 继承
 * 重写
 * 父类引用指向子类
 */
public class Test {

	public static void main(String[] args) {
// 以Cat对象调用show
		show(new Cat());
// 以Dog对象调用show
		show(new Dog());

//		当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法。
//		多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。
		
//		向上转型
		Animal a = new Cat();
		a.eat();
//		向下转型
		Cat c = (Cat)a;
		c.work();
		
//		向上转型
		Animal b = new Dog();
		b.eat();
//向下转型
		Dog d = (Dog)b;
		d.work();
	}
	
	public static void show (Animal a) {
		a.eat();
		if (a instanceof Cat) {
			Cat c = (Cat)a;
//			猫的工作
			c.work();
		} else if (a instanceof Dog) {
			Dog c = (Dog)a;
			c.work();
		}
	}
}

abstract class Animal {
	abstract void eat();
}

class Cat extends Animal {
	public void eat() {
		System.out.println("次鱼🐟");
	}
	
	public void work() {
		System.out.println("抓老鼠🐭");
	}
}

//继承自抽象类，则需要实现抽象类的所有方法
class Dog extends Animal {
	public void eat() {
		System.out.println("啃骨头");
	}
	
	public void work() {
		System.out.println("看门");
	}
}