package com.runoob.wanglang.oo.abstr;

public class AbstractDemo {

	public static void main(String[] args) {
//		抽象类不能直接来实例化
//		Cannot instantiate the type Employee
//		Employee e = new Employee("George W.", "Houston, TX", 43);
//		但是我们可以实例化一个Salary对象，该对象从Employee类继承3个成员变量和7个成员方法
		Salary s = new Salary("Maha" , "Ameden, UOP", 3, 3600.0);
		Employee e = new Salary("John", "Boston, MA", 2, 2400.0);
		
		System.out.println("\n Call mailCheck using Salary ref--");
		s.mailCheck();
		
		System.out.println("\n Call mailCheck using Employee ref--");
		e.mailCheck();
//		发现此方法是虚拟方法
//		e 是Employee类的引用，只在编译的时候，编译器检查
	}
}
