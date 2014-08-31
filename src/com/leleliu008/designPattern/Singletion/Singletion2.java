package com.leleliu008.designPattern.Singletion;

/**
 * 饿汉模式
 * @author leleliu008
 * @date 2012.12.05
 */

public class Singletion2 {

	private static Singletion2 instance = new Singletion2();
	
	public static Singletion2 getInstance() {
		return instance;
	}
}
