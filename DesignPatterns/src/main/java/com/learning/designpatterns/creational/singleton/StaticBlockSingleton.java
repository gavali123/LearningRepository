package com.learning.designpatterns.creational.singleton;

public class StaticBlockSingleton {

	private static final StaticBlockSingleton INSTANCE;

	static {
		INSTANCE = new StaticBlockSingleton();
	}

	private StaticBlockSingleton() {
	}

	public StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
