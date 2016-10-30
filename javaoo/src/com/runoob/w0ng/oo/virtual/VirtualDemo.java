package com.runoob.wanglang.oo.virtual;

public class VirtualDemo {

	public static void main(String[] args) {
		Salary s = new Salary("员工A ", "北京", 3, 3600.0);
		Employee e = new Salary("员工S ", "上海", 2, 2400.0);
		
//		当调用 s.mailCheck() 时，编译器在编译时发现 mailCheck() 在 Salary 类中，执行过程 JVM 就调用 Salary 类的 mailCheck()
//		在调用s.mailCheck()时，Java虚拟机(JVM)调用Salary类的mailCheck()方法
		System.out.println("使用Salary的引用调用 mailCheck --");
		s.mailCheck();

//		因为 e 是 Employee 的引用，所以调用 e 的 mailCheck() 方法时，编译器会去 Employee 类查找 mailCheck() 方法
//		在编译的时候，编译器使用 Employee 类中的 mailCheck() 方法验证该语句，但是在运行的时候，Java虚拟机(JVM)调用的是 Salary 类中的mailCheck()方法
//		重写的方法能在运行时调用，不管编译的时候源代码中引用变量是什么数据类型
//		以上整个过程被称为虚拟方法调用，该方法被称为虚拟方法
		System.out.println("\n使用 Employee 的引用调用 mailCheck --");
		e.mailCheck();
	}
}
