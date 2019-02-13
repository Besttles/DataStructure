package com.cons;

import java.util.ArrayList;
import java.util.List;

public class FillType<T> {

	private Class<T> type;
	public FillType(Class<T> type){
		this.type = type;
	}
	
	public List<T> create(int num){
		List<T> result = new ArrayList<>();
			try {
				for(int i = 0; i<num;i++) {
				result.add(type.newInstance());
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return result;
	}
	public static void main(String [] args) {
		FillType<CountedInteger> fl = 
				new FillType<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(15));
	}
}
