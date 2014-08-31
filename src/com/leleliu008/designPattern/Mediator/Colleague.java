package com.leleliu008.designPattern.Mediator;

/**
 * 同事
 * @author leleliu008
 * @date 2012.10.08
 */

public abstract class Colleague {

	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
		mediator.addColleague(this);
		
	}
	
	
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	public Mediator getMediator() {
		return mediator;
	}
	
	/**
	 * 自己做事情
	 */
	public abstract void self();
	
	/**
	 * 请别的同事做事情
	 */
	public abstract void out();
}
