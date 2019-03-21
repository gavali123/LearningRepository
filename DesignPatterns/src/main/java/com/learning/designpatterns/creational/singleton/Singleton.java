package com.learning.designpatterns.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = -2376717990162578119L;

	private Singleton() {
	}

	private static class SingletonHolder {
		public static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
