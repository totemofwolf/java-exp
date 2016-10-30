package com.runoob.wanglang.oo.ovl;
/**
 * 
 * @author wanglang
 * 重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
 * 每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表
 * 只能重载构造函数
 * 重载规则
 * 被重载的方法必须改变参数列表；
 * 被重载的方法可以改变返回类型；
 * 被重载的方法可以改变访问修饰符；
 * 被重载的方法可以声明新的或更广的检查异常；
 * 方法能够在同一个类中或者在一个子类中被重载。
 */
public class Overloading {

	public int test() {
		System.out.println("test1");
		return 1;
	}
	
	public void test(int a) {
		System.out.println("test2");
	}
	
	public String test(int a, String s) {
		System.out.println("test3");
		return "returntest3";
	}
	
	public String test(String s, int a) {
		System.out.println("test4");
		return "returntest4";
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		System.out.println(o.test());
		
		o.test(1);
		
		System.out.println(o.test(1, "test3"));
		
		System.out.println(o.test("test4", 1));
	}
}

//区别：重写，重载
//区别点	重载		重写
//参数		必须修改	一定不能修改
//返回		可以修改	一定不能修改
//异常		可以修改	可以减少
//访问		可以修改	可以降低限制