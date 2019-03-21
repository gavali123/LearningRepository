package com.learning.designpatterns.creational.factory;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		// TODO Auto-generated method stub
		System.out.println("Luxury Car ...");
	}

}
