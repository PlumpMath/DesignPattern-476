package com.leleliu008.designPattern.Proxy;

/**
 * 真是主题角色
 * @author leleliu008
 * @date 2012.09.19
 */

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int a, int b) {
		System.out.println("-----------------CalculatorImpl.add()");
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("-----------------CalculatorImpl.sub()");
		return a - b;
	}
	
	@Override
	public int multiply(int a, int b) {
		System.out.println("-----------------CalculatorImpl.multiply()");
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		System.out.println("-----------------CalculatorImpl.div()");
		int result = 0;
		try {
			result = a / b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
