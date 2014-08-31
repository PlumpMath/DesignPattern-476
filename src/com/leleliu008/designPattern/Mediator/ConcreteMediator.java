package com.leleliu008.designPattern.Mediator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 具体的中介者
 * @author leleliu008
 * @date 2012.10.08
 */

public class ConcreteMediator extends Mediator {

	@SuppressWarnings("unchecked")
	@Override
	public void doAction(String colleagueClassName, String methodName) {
		if (null == colleagueClassName || null == methodName) {
			return;
		}
		
		System.out.println("具体中介者开始工作了");
		
		try {
			//注意这里由于colleagues使用了WeakHashMap
			//所以得到的colleague有可能为null，导致发生NullPointerException异常
			//所以在最下面加了Exception的catch所有异常
			Colleague colleague = colleagues.get(colleagueClassName);
			Class colleagueClass = colleague.getClass();
			Method method = colleagueClass.getDeclaredMethod(methodName, new Class[]{});
			method.invoke(colleague, new Object[]{});
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
