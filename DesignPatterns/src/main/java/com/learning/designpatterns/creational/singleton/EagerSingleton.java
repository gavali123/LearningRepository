package com.learning.designpatterns.creational.singleton;

public class EagerSingleton {

	// Singleton with eager initialization
	private static volatile EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}

}
