package com.cjc.karve;

public class A {
	public void m1()//public access any where
	{
	System.out.println("public m1______A");
	}
	void m2()//default access only within a package
	{
		System.out.println("default m2_____A");
	}
	private void m3()//private access only within a class
	{
		System.out.println("private m3_____A");
	}
	protected void m4()//protected access within and outside package 
	                   //should be child class
	{
		System.out.println("protected m4_____A");
	}
	public void aa()
	{
		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();

}
}
