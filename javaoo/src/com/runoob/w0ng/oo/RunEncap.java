package com.runoob.wanglang.oo;

public class RunEncap {

	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		encap.setName("Jacks");
		encap.setAge(20);
		encap.setIdNum("12345553s");
		
		System.out.println("Name : " + encap.getName() + " \nAge : " + encap.getAge() + "\nidnum : " + encap.getIdNum());
	}
}
