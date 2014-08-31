package com.leleliu008.designPattern.Mediator;

/**
 * 具体的同事A
 * @author leleliu008
 * @date 2012.10.08
 */

public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	//每个具体同事必然有自己分内的事，没必要与外界相关联
	public void self() {
		System.out.println("同事A --> 做好自己分内的事情 ...");
	}

	//每个具体同事总有需要与外界交互的操作，通过中介者来处理这些逻辑并安排工作
	public void out() {
		System.out.println("同事A --> 请求同事B做好分内工作 ...");
		mediator.doAction("ConcreteColleagueB", "self");
	}
}
