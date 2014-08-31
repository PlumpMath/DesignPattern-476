package com.leleliu008.designPattern.Singletion;

/**
 * 双检锁模式
 * @author leleliu008
 * @date 2012.12.05
 */

public class Singletion6 {

	private static Singletion6 instance;
	
	private Singletion6() {}
	
	public static Singletion6 getinstance() {
		if (null == instance) {
			synchronized (Singletion6.class) {
				if (null == instance) {
					instance = new Singletion6();
				}
			}
		}
		return instance;
	}
}
