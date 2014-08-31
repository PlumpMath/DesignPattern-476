package com.leleliu008.designPattern.Singletion;

/**
 * 懒汉方式，线程安全的
 * @author leleliu008
 * @date 2012.12.05
 */

public class Singletion7 {

	private static Singletion7 instance;
	
	private Singletion7() {}
	
	public static synchronized Singletion7 getInstance() {
		if (null == instance) {
			instance = new Singletion7();
		}
		return instance;
	}
}
