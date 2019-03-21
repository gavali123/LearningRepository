package com.learning.designpatterns.creational.factory;

public class TestFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}
}
