package com.runoob.w0ng.oo.itfc;

public interface Hockey extends Sports {

//	Hockey 接口自己声明了四个方法，又继承自Sports
//	实现Hockey接口的类需要实现6个方法
	public void homeGoalScored();
	public void visitGoalScored();
	public void endOfPeriod(int period);
	public void overtimePeriod(int ot);
}
