package com.leleliu008.designPattern.Mediator;

import java.util.WeakHashMap;

/**
 * 中介者
 * @author leleliu008
 * @date 2012.10.08
 */
public abstract class Mediator {

	protected WeakHashMap<String, Colleague> colleagues;
	
	public Mediator() {
		colleagues = new WeakHashMap<String, Colleague>();
	}
	
	public void addColleague(Colleague colleague) {
		if (null != colleague) {
			String key = colleague.getClass().getSimpleName();
			colleagues.put(key, colleague);
		}
	}
	
	public void remveColleague(String className) {
		colleagues.remove(className);
	}
	
	public abstract void doAction(String colleagueClassName, String methodName);

}
