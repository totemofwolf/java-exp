package com.runoob.wanglang.oo.over1;
/**
 * 
 * @author wanglang
 * 方法重新规则:
 * 参数列表必须完全与被重写方法的相同
 * 返回类型必须完全与被重写方法的返回类型相同
 * 访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为public，那么在子类中重写该方法就不能声明为protected
 * 父类的成员方法只能被它的子类重写
 * 声明为final的方法不能被重写
 * 声明为static的方法不能被重写，但是能够被再次声明
 * 子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为private和final的方法
 * 子类和父类不在同一个包中，那么子类只能够重写父类的声明为public和protected的非final方法
 * 重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以
 * 构造方法不能被重写
 * 
 */

class Animal {
	
	public void move() {
		System.out.println("动物可以动");
	}
}

class Dog extends Animal {

	public void move() {
		System.out.println("狗🐶可以走和跑");
	}
	
	public void bark() {
		System.out.println("狗🐶可以吠");
	}
}

public class TestDog1 {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Dog();
		
//		调用Animal类的方法
		a.move();
		
//		调用Dog类的方法
		b.move();

//		b的引用类型Animal类没有bark方法
//		The method bark() is undefined for the type Animal
//		b.bark();
		
//		需要强制转换为Dog类
		((Dog) b).bark();
	}
}
