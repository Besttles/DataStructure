package com.data;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) {
	Map<String,String> map = new HashMap<>();
	//key为null时只能在map 的首位
	map.put("12", "电影");
	map.put(null, "2332");
	map.put("56", "dffdf");
	for(Map.Entry<String, String> entry:map.entrySet()) {
		System.out.println("键"+entry.getKey()+"值"+entry.getValue());
	}
	
	
}
}
