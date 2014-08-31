package com.leleliu008.designPattern.ChainOfResponsibility;

/**
 * 
 * @author leleliu008
 * @date 2012.12.12
 */

public interface IHandler {

	void intercept();
	
	void dispatch();
	
	void handle();
}
