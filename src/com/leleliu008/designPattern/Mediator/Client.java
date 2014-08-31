package com.leleliu008.designPattern.Mediator;

/**
 * 测试客户端
 * @author leleliu008
 * @date 2012.10.08
 */

public class Client {

	public static void main(String[] args) {
		//创建中介者
		Mediator mediator = new ConcreteMediator();
		
		//创建两个同事
		Colleague colleagueA = new ConcreteColleagueA(mediator);
		Colleague colleagueB = new ConcreteColleagueB(mediator);
		
		colleagueA.self();
		colleagueA.out();
		System.out.println("============合作愉快，任务完成！\n");
		
		colleagueB.self();
		colleagueB.out();
		System.out.println("============合作愉快，任务完成！\n");
	}
	
}
