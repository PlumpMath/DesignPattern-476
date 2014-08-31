package com.leleliu008.designPattern.Singletion;

/**
 * 
 * @author leleliu008
 * @date 2012.12.05
 */

public class Singletion3 {

	private static Singletion3 instance;
	
	static {
		System.out.println("static block");
		instance = new Singletion3();
	}
	
	public static Singletion3 getInstance() {
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println("main method invoked");
	}
}
