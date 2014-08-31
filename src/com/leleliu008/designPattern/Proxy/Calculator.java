package com.leleliu008.designPattern.Proxy;

/**
 * 抽象主题角色
 * @author leleliu008
 * @date 2012.09.19
 */

public interface Calculator {

	/**
	 * 相加
	 */
	int add(int a, int b);
	
	/**
	 * 相减
	 */
	int sub(int a, int b);
	
	/**
	 * 相乘
	 */
	int multiply(int a, int b);
	
	/**
	 * 相除
	 */
	int div(int a, int b);
}
