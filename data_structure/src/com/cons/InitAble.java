package com.cons;

public class InitAble {
	
	static final int num = 1;
	
	static final  int num2 = 
			ClassIniationZation.rand.nextInt(100);
	
	static {
		System.out.println("执行类1");
	}

}

