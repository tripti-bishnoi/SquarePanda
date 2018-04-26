package com.random.practice;

public class MySingletonClass {

	private static final MySingletonClass obj = new MySingletonClass();
	
	private MySingletonClass(){
		
	}
	
	public static MySingletonClass instance(){
		return obj;
	}
}
