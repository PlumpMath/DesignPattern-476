package com.leleliu008.designPattern.Bridge;

/**
 * 焦点，将一些具体不同业务抽象为Focus
 * @author leleliu008
 * @date 2012.10.10
 */

public abstract class Focus {

	protected Mode mode;
	
	public Focus(Mode mode) {
		this.mode = mode;
	}
	
	
}
