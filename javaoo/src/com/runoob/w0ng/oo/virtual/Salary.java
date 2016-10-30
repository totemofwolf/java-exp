package com.runoob.wanglang.oo.virtual;

public class Salary extends Employee {

//public Salary(String name, String address, int number) {
//		super(name, address, number);
//		// TODO Auto-generated constructor stub
//	}

	//	年薪
	private double salary;

//	继承自Employee必须有构造函数
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}
	
	public void mailCheck() {
		System.out.println("Salary 类的mailCheck方法 ");
//		System.out.println("邮寄支票给 : " + getName() + " , 工资为 : " + salary);
//		System.out.println("邮寄支票给 : " + getName() + "， 工资为 : " + this.getSalary());
		System.out.println("邮寄支票给 : " + this.getName() + "， 工资为 : " + this.getSalary());
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("计算工资，付给 : " + getName());
		return salary / 52;
	}
}