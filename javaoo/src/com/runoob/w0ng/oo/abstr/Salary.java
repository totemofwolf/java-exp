package com.runoob.wanglang.oo.abstr;

public class Salary extends Employee {
// 继承自抽象类，需要实现抽象类的构造方法
	private double salary;
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}
	
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class");
		System.out.println("Mailing check to " + getName() + " with salary " + salary);
	}
	
	public double getSalary() {
		return salary;
	}
	
	private void setSalary(double newSalary) {
		// TODO Auto-generated method stub
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
//		return salary / 52;
		return getSalary() / 52;
	}
}
