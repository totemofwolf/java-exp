package com.runoob.wanglang.oo.abstr;

public abstract class Employee {

	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number) {
		System.out.println("Construncting an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
//	public double computePay() {
//		System.out.println("Inside Employee computePay");
//		return 0.0;
//	}
	
	public abstract double computePay();
//	抽象方法
//	一个类包含抽象方法，需是抽象类
//	任何子类必须重写父类的抽象方法，否则子类也必须声明为抽象类
	
	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
	
	public String toString() {
		return name + " " + address + " " + number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public int getNumber() {
		return number;
	}
}
