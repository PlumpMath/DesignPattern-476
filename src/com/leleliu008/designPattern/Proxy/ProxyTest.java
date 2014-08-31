package com.leleliu008.designPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 * @author leleliu008
 * @date 2012.09.19
 */

public class ProxyTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		System.out.println("-------------- 没有使用代理 ------------");
//		Calculator calculatorImpl = new CalculatorImpl();
//		int result1 = calculatorImpl.add(1, 2);
//		System.out.println("result: " + result1);
//		
//		System.out.println("\n-------------- 使用代理 ------------");
//		Calculator calculator = new CalculatorProxy();
//		int result2 = calculator.add(1, 2);
//		System.out.println("result: " + result2);
		
		
		Calculator calculator = new CalculatorImpl();
		ClassLoader classLoader = ProxyTest.class.getClassLoader();
		Class[] interfaces = new Class[]{Calculator.class};
		InvocationHandler invocationHandler = new CalculatorHandler(calculator);
		Calculator calculatorProxy = (Calculator) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
		int result = calculatorProxy.add(1, 2);
		System.out.println("result: " + result);
		
		
//		try {
//			Method method = calculator.getClass().getDeclaredMethod("add", new Class[] {int.class, int.class});
//			int result = (Integer) invocationHandler.invoke(calculator, method, new Object[] {1,2});
//			System.out.println(result);
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
	}
}
