package com.leleliu008.designPattern.ChainOfResponsibility;

/**
 * 
 * @author leleliu008
 * @date 2012.12.12
 */

public class Client{ 

	public static void main(String[] args) {
		C c = new C(){
			@Override
			public void a() {
				System.out.println("a-------------");
			};
			@Override
			public void b() {
				System.out.println("b-------------");
			};
			@Override
			public void c() {
				System.out.println("c-------------");
			};
		};
		c.a();
		c.b();
		c.c();
	}
}

interface A {
	void a();
}

interface B {
	void b();
}

interface C extends A,B {
	void c();
}