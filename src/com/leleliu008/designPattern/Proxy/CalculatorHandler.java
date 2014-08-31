package com.leleliu008.designPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * 对被代理的类的方法处理
 * @author leleliu008
 * @date 2012.09.19
 */

public class CalculatorHandler implements InvocationHandler {

	private Calculator mCalculator;
	
	public CalculatorHandler() {
		
	}
	
	public CalculatorHandler(Calculator calculator) {
		mCalculator = calculator;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("-----------------------------------");
		System.out.println("proxy: " + proxy.getClass().getName());
		System.out.println("method: " + method.getName());
		if(null != args) {
			String tempStr = "args: ";
			for (Object object : args) {
				tempStr += object + ", ";
			}
			System.out.println(tempStr.substring(0, tempStr.length() - 2));
		}
		
		Object result = null;
		try {
			System.out.println("----------------- before");
			
			result = method.invoke(mCalculator, args);
			
			System.out.println("----------------- after");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (null == result) {
			result = new Object();
		}
		return result;
	}

}
