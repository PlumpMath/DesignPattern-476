package com.leleliu008.designPattern.Singletion;

/**
 * 懒汉方式
 * @author leleliu008
 * @date 2012.12.05
 */

public class Singletion5 {

	private static Singletion5 instance;
	
	private Singletion5() {}
	
	public static Singletion5 getInstance() {
		if (null == instance) {
			instance = new Singletion5();
		}
		return instance;
	}
}
