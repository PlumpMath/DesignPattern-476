package com.leleliu008.designPattern.Proxy;

/**
 * 静态代理
 * @author leleliu008
 * @date 2012.09.19
 */

public class CalculatorProxy implements Calculator {
	
	private Calculator mCalculator;
	
	public CalculatorProxy() {
		mCalculator = new CalculatorImpl();
	}
	
	@Override
	public int add(int a, int b) {
		System.out.println("----------------- before");
		int result = mCalculator.add(a, b);
		System.out.println("----------------- after");
		return result;
	}

	@Override
	public int div(int a, int b) {
		System.out.println("----------------- before");
		int result = mCalculator.div(a, b);
		System.out.println("----------------- after");
		return result;
	}

	@Override
	public int multiply(int a, int b) {
		System.out.println("----------------- before");
		int result = mCalculator.multiply(a, b);
		System.out.println("----------------- after");
		return result;
	}

	@Override
	public int sub(int a, int b) {
		System.out.println("----------------- before");
		int result = mCalculator.sub(a, b);
		System.out.println("----------------- after");
		return result;
	}

}
