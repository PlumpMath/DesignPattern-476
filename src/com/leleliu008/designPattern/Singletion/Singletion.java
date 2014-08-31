package com.leleliu008.designPattern.Singletion;

/**
 * Bob Lee实现的单例模式，目前被认为是最佳的实现
 * 在加载singleton时并不加载它的内部类SingletonHolder
 * 而在调用getInstance（）时调用SingletonHolder时才加载SingletonHolder
 * 从而调用singleton的构造函数，实例化singleton
 * 从而达到lazy loading的效果
 * @author leleliu008
 * @date 2012.10.08
 */
public class Singletion {

	static class SingletionHolder {
		static final Singletion instance = new Singletion();
	}
	
	private Singletion() {}
	
	public static Singletion getInstance() {
		return SingletionHolder.instance;
	}
	
}