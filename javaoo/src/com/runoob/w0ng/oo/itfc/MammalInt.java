package com.runoob.w0ng.oo.itfc;

public class MammalInt implements Animals {
//类实现接口的时候，需要实现接口中的所有方法，否则必须声明为抽象类
//	公式：
//	... implements 接口名称[, 其他接口, ...] ...
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal eats");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travels");
	}

// 重写接口中的方法时，有如下规则：
// 类实现接口方法，不可抛出异常，只可在接口或者继承接口的抽象类中抛出该强制异常
// 类重写方法需保持一致的方法名，并且需保持相同或者兼容的返回值类型
	
	public int noOfLegs(){
		return 0;
	}

//	实现接口的时候，如下规则：
//	一个类可以同时实现多个接口
//	一个类只能继承一个类，但是可以实现多个接口
//	一个接口能继承另一个接口，类似于类间继承

	public static void main(String[] args) {
//		MammalInt m = new MammalInt();
		Animals m = new MammalInt();
//		多态
		m.eat();
		m.travel();
		
	}
}
