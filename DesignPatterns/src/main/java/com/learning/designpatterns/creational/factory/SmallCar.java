package com.learning.designpatterns.creational.factory;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		// TODO Auto-generated constructor stub
		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Small Car ...");
	}

}
