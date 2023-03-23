package com.cjc.akurdi;

import com.cjc.karve.A;

public class Z extends X{
	public void zz()
	{
	 Z z=new Z();
	//Call methods here which are valid for calling
	 z.m1();
	 z.m4();
	 System.out.println("      aa method");
	z.aa();
	
	 

	X x=new X();
	//Call methods here which are valid for calling
	x.m1();
	System.out.println("       aa method");
	x.aa();    
	
	A a=new A();
	//Call methods here which are valid for calling	
	a.m1();
	System.out.println("       aa method");
	a.aa();
	}
	public static void main(String args[])
	
	{
		Z z1=new Z();
		z1.aa();
		z1.xx();
		z1.zz();
		
    
	}
	}

